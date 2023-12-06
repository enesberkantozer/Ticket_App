package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

import prolab2.Company;
import prolab2.Vehicle;

import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class AdminFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private DefaultTableModel tablemodel;

	/**
	 * Create the frame.
	 */
	public void execute() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTable table = new JTable();
		table.setRowHeight(35);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablemodel = new DefaultTableModel();
		table.setModel(tablemodel);
		tablemodel.addColumn("Firma Adı");
		tablemodel.addColumn("Kullanıcı Adı");
		tablemodel.addColumn("Şifre");
		table.setDefaultEditor(Object.class, null);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 10, 766, 347);
		contentPane.add(scrollPane);

		JButton btnNewButton = new JButton("Seçili Firmayı Güncelle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateCompanyDialog update = new UpdateCompanyDialog(tablemodel, table.getSelectedRow());
				update.execute();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 376, 191, 77);
		contentPane.add(btnNewButton);

		JButton btnFirma = new JButton("Firma Ekle");
		btnFirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCompanyDialog addCompany = new AddCompanyDialog();
				addCompany.addRow(tablemodel);
			}
		});
		btnFirma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFirma.setBounds(303, 376, 191, 77);
		contentPane.add(btnFirma);

		JButton btnSeiliFirmaySil = new JButton("Seçili Firmayı Sil");
		btnSeiliFirmaySil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() >= 0) {
					for (int i = 0; i < Vehicle.vehiclesList.size(); i++) {
						Vehicle v=Vehicle.vehiclesList.get(i);
						if(v.getCompanyName().equals(table.getValueAt(table.getSelectedRow(), 0))) {
							Vehicle.vehiclesList.remove(i);
							i--;
						}
					}
					Company.companysList.remove(table.getSelectedRow());
					tablemodel.removeRow(table.getSelectedRow());
					Company.companyCount--;
				}
			}
		});
		btnSeiliFirmaySil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSeiliFirmaySil.setBounds(585, 376, 191, 77);
		contentPane.add(btnSeiliFirmaySil);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				LoginFrame login = new LoginFrame();
				login.execute(0);
			}

			@Override
			public void windowOpened(WindowEvent e) {
				if (Company.companyCount > 0) {
					ArrayList<Company> companys = Company.companysList;
					for (int i = 0; i < Company.companyCount; i++) {
						String[] data = { companys.get(i).getCompanyName(), companys.get(i).getUsername(),
								companys.get(i).getPassword() };
						tablemodel.addRow(data);
					}
				}
			}
		});
	}

	public void setTable(String[] data) {
		tablemodel.addRow(data);
	}
}
