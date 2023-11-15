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

public class AddCompany extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCompany frame = new AddCompany();
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
	public AddCompany() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setRowHeight(35);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultTableModel tablemodel=new DefaultTableModel();
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 376, 191, 77);
		contentPane.add(btnNewButton);
		
		JButton btnFirma = new JButton("Firma Ekle");
		btnFirma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFirma.setBounds(303, 376, 191, 77);
		contentPane.add(btnFirma);
		
		JButton btnSeiliFirmaySil = new JButton("Seçili Firmayı Sil");
		btnSeiliFirmaySil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()!=-1) {
					tablemodel.removeRow(table.getSelectedRow());
				}
			}
		});
		btnSeiliFirmaySil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSeiliFirmaySil.setBounds(585, 376, 191, 77);
		contentPane.add(btnSeiliFirmaySil);
	}
}
