package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class TravelSearchFrame extends JFrame {

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
					TravelSearchFrame frame = new TravelSearchFrame();
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
	public TravelSearchFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
		table.setRowHeight(35);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultTableModel tablemodel = new DefaultTableModel();
		table.setModel(tablemodel);
		tablemodel.addColumn("Firma İsmi");
		tablemodel.addColumn("Ulaşım Tipi");
		tablemodel.addColumn("Kapasite");
		tablemodel.addColumn("Tarih-Saat");
		tablemodel.addColumn("Fiyat");
		table.setDefaultEditor(Object.class, null);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 10, 880, 429);
		contentPane.add(scrollPane);
		
		
	}
}
