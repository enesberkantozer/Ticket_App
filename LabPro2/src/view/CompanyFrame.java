package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import prolab2.Airplane;
import prolab2.Bus;
import prolab2.Company;
import prolab2.Train;
import prolab2.Vehicle;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void execute(String[] args, Company company) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyFrame frame = new CompanyFrame(company);
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
	public CompanyFrame(Company company) {
		setTitle(company.getCompanyName()+" Firması");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 883, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(company.getCompanyName()+" Frame Ekranı");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 849, 39);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 47, 849, 2);
		contentPane.add(separator);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
		table.setRowHeight(35);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultTableModel tablemodel = new DefaultTableModel();
		table.setModel(tablemodel);
		tablemodel.addColumn("Araç ID");
		tablemodel.addColumn("Sefer No");
		tablemodel.addColumn("Kapasite");
		tablemodel.addColumn("Tarih-Saat");
		tablemodel.addColumn("Yakıt Tipi");
		tablemodel.addColumn("Yakıt Maliyeti");
		tablemodel.addColumn("Çalışan Ücreti");
		tablemodel.addColumn("Servis Ücreti");
		table.setDefaultEditor(Object.class, null);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 59, 849, 409);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Araç Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddVecihlePanel addVecihle=new AddVecihlePanel();
				addVecihle.addRow(company.getCompanyName(),tablemodel);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(111, 491, 165, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Araç Çıkar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() >= 0) {
					tablemodel.removeRow(table.getSelectedRow());
					for (int i = 0; i < Vehicle.vehicleCount; i++) {
						if(Vehicle.vehiclesList.get(i).getCompanyName().equals(company.getCompanyName())&&
								Vehicle.vehiclesList.get(i).getVehicleId().equals(table.getValueAt(table.getSelectedRow(), 0).toString())) {
							Vehicle.vehiclesList.remove(i);
							Vehicle.vehicleCount--;
							break;
						}
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(574, 491, 165, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Sefer Düzenle");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() >= 0) {
					String[] vhclData= new String[10];
					for (int i = 0; i < Vehicle.vehicleCount; i++) {
						Vehicle vhcl=Vehicle.vehiclesList.get(i);
						if(vhcl.getCompanyName().equals(company.getCompanyName()) && vhcl.getVehicleId().equals(table.getValueAt(table.getSelectedRow(), 0).toString())) {
							if(vhcl instanceof Bus) {
								vhclData[0]="Bus";
							}
							else if(vhcl instanceof Train) {
								vhclData[0]="Train";
							}
							else if(vhcl instanceof Airplane) {
								vhclData[0]="Airplane";
							}
							for (int j = 1; j < vhclData.length-1; j++) {
								vhclData[j]=String.valueOf(table.getValueAt(table.getSelectedRow(), j-1));
							}
						}
					}
					vhclData[9]=company.getCompanyName();
					UpdateVecihlePanel updateRow=new UpdateVecihlePanel();
					updateRow.updateRow(vhclData, table);
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(340, 491, 165, 56);
		contentPane.add(btnNewButton_1_1);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				LoginFrame login = new LoginFrame();
				login.execute(0);
			}
			@Override
			public void windowOpened(WindowEvent e) {
				if(Vehicle.vehicleCount>0) {
					DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MMM.yyyy HH:mm");
					ArrayList<Vehicle> vehicles = Vehicle.vehiclesList;
					for (int i = 0; i < Vehicle.vehicleCount; i++) {
						if(vehicles.get(i).getCompanyName().equals(company.getCompanyName())) {
							String[] data= {vehicles.get(i).getVehicleId(),String.valueOf(vehicles.get(i).getVehicleTravelNo()),
									String.valueOf(vehicles.get(i).getVehicleCapacity()), vehicles.get(i).getBeginTime().format(formatter),
									vehicles.get(i).getTypeFuel(), String.valueOf(vehicles.get(i).getPriceFuel()), 
									String.valueOf(vehicles.get(i).getCostDriver()), String.valueOf(vehicles.get(i).getCostService())};
							tablemodel.addRow(data);
						}
					}
				}
			}
		});
		
	}
}
