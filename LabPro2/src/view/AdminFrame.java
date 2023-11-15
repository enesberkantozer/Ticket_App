package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

public class AdminFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private static DefaultTableModel tablemodel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				String[] companyLoginData=new String[(tablemodel.getRowCount())*2];
				for (int i = 0; i < companyLoginData.length; i+=2) {
					companyLoginData[i]= table.getValueAt(i/2, 2).toString();
					companyLoginData[i+1]= table.getValueAt(i/2, 3).toString();
				}
				LoginFrame.main(companyLoginData);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setRowHeight(35);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablemodel = new DefaultTableModel();
		table.setModel(tablemodel);
		tablemodel.addColumn("Firma Adı");
		tablemodel.addColumn("Hizmet Bedeli");
		tablemodel.addColumn("Kullanıcı Adı");
		tablemodel.addColumn("Şifre");
		table.setDefaultEditor(Object.class, null);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 10, 766, 347);
		contentPane.add(scrollPane);

		JButton btnNewButton = new JButton("Seçili Firmayı Güncelle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					int selectedRow = table.getSelectedRow();
					String[] rowData = new String[4];
					for (int i = 0; i < rowData.length; i++) {
						rowData[i] = table.getValueAt(selectedRow, i).toString();
					}
					UpdateCompanyDialog.main(rowData, tablemodel, table.getSelectedRow());
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 376, 191, 77);
		contentPane.add(btnNewButton);

		JButton btnFirma = new JButton("Firma Ekle");
		btnFirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCompanyDialog.main(null);
			}
		});
		btnFirma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFirma.setBounds(303, 376, 191, 77);
		contentPane.add(btnFirma);

		JButton btnSeiliFirmaySil = new JButton("Seçili Firmayı Sil");
		btnSeiliFirmaySil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					tablemodel.removeRow(table.getSelectedRow());
				}
			}
		});
		btnSeiliFirmaySil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSeiliFirmaySil.setBounds(585, 376, 191, 77);
		contentPane.add(btnSeiliFirmaySil);
	}

	public static void setTable(String[] data) {
		tablemodel.addRow(data);
	}
}
