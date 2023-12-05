package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import prolab2.Trip;
import prolab2.Vehicle;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TravelSearchFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame=new JFrame();
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	public TravelSearchFrame(String begin,String end, LocalDateTime date) {
		TravelSearchFrame me=this;
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 914, 576);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTable table = new JTable();
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
		tablemodel.addColumn("Araç ID");
		table.setDefaultEditor(Object.class, null);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 10, 880, 458);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Bilet Al");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=table.getValueAt(table.getSelectedRow(), 5).toString();
				for (int i = 0; i < Vehicle.vehiclesList.size(); i++) {
					if(id.equals(Vehicle.vehiclesList.get(i).getVehicleId())) {
						String data[]= {table.getValueAt(table.getSelectedRow(), 1).toString(),begin,end,table.getValueAt(table.getSelectedRow(), 0).toString()};
						Vehicle.vehiclesList.get(i).arac.execute(me,data,date);
					}
				}
			}
		});
		btnNewButton.setBounds(360, 478, 172, 51);
		contentPane.add(btnNewButton);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				LoginFrame login = new LoginFrame();
				login.execute(0);
			}
			@Override
			public void windowOpened(WindowEvent e) {
				String[] rowsData= new String[6];
				ArrayList<String> avaibleTrips=Trip.seferBul(begin, end, date);
				for (int i = 0; i < avaibleTrips.size()/6; i++) {
					rowsData[0]=avaibleTrips.get(i*6);
					rowsData[1]=avaibleTrips.get(i*6+1);
					rowsData[2]=avaibleTrips.get(i*6+2);
					rowsData[3]=avaibleTrips.get(i*6+3);
					rowsData[4]=avaibleTrips.get(i*6+4);
					rowsData[5]=avaibleTrips.get(i*6+5);
					tablemodel.addRow(rowsData);
				}
			}
		});
	}
	public void execute() {
		frame.setVisible(true);
	}
}
