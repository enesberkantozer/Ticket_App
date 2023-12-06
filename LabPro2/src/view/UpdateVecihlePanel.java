package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import prolab2.Bus;
import prolab2.Train;
import prolab2.Vehicle;
import prolab2.Airplane;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTable;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UpdateVecihlePanel extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtVehicleID;
	private JTextField txtPriceOfFuel;
	private JTextField txtDriver;
	private JTextField txtService;
	
	public UpdateVecihlePanel() {
		
	}

	/**
	 * Launch the application.
	 */
	public void updateRow(String[] args,JTable tablemodel) {
		try {
			UpdateVecihlePanel dialog = new UpdateVecihlePanel(args,tablemodel);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UpdateVecihlePanel(String[] args,JTable tablemodel) {
		setBounds(100, 100, 379, 590);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JRadioButton rdBtnBus = new JRadioButton("Otobüs");
		rdBtnBus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdBtnBus.setBounds(10, 23, 81, 36);
		contentPanel.add(rdBtnBus);

		JRadioButton rdbtnTrain = new JRadioButton("Tren");
		rdbtnTrain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnTrain.setBounds(124, 23, 91, 36);
		contentPanel.add(rdbtnTrain);

		JRadioButton rdbtnAirplane = new JRadioButton("Uçak");
		rdbtnAirplane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAirplane.setBounds(236, 23, 91, 36);
		contentPanel.add(rdbtnAirplane);

		ButtonGroup radioButtons = new ButtonGroup();
		radioButtons.add(rdBtnBus);
		radioButtons.add(rdbtnTrain);
		radioButtons.add(rdbtnAirplane);

		JLabel lblNewLabel = new JLabel("Araç ID:\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 78, 144, 36);
		contentPanel.add(lblNewLabel);

		JLabel lblAraIdHz = new JLabel("Durum:");
		lblAraIdHz.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAraIdHz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAraIdHz.setBounds(10, 124, 144, 36);
		contentPanel.add(lblAraIdHz);

		JLabel lblAraIdHz_1 = new JLabel("Kapasite:");
		lblAraIdHz_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAraIdHz_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAraIdHz_1.setBounds(10, 170, 144, 36);
		contentPanel.add(lblAraIdHz_1);

		JLabel lblAraIdHz_2 = new JLabel("Yakıt Tipi:");
		lblAraIdHz_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAraIdHz_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAraIdHz_2.setBounds(10, 216, 144, 36);
		contentPanel.add(lblAraIdHz_2);

		JLabel lblAraIdHz_3 = new JLabel("Yakıt Maliyeti:");
		lblAraIdHz_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAraIdHz_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAraIdHz_3.setBounds(10, 262, 144, 36);
		contentPanel.add(lblAraIdHz_3);

		JLabel lblAraIdHz_4 = new JLabel("Çalışan Ücreti:");
		lblAraIdHz_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAraIdHz_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAraIdHz_4.setBounds(10, 308, 144, 36);
		contentPanel.add(lblAraIdHz_4);

		JLabel lblAraIdHz_5 = new JLabel("Servis Ücreti:");
		lblAraIdHz_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAraIdHz_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAraIdHz_5.setBounds(10, 354, 144, 36);
		contentPanel.add(lblAraIdHz_5);

		txtVehicleID = new JTextField();
		txtVehicleID.setBounds(164, 81, 163, 36);
		contentPanel.add(txtVehicleID);
		txtVehicleID.setColumns(10);

		JComboBox comboRoute = new JComboBox();
		comboRoute.setBounds(164, 130, 163, 30);
		contentPanel.add(comboRoute);

		JComboBox comboCapacity = new JComboBox();
		comboCapacity.setModel(new DefaultComboBoxModel(new String[] { "", "15", "20", "25", "30" }));
		comboCapacity.setBounds(164, 176, 163, 30);
		contentPanel.add(comboCapacity);

		JComboBox comboTypeOfFuel = new JComboBox();
		comboTypeOfFuel.setBounds(164, 222, 163, 30);
		contentPanel.add(comboTypeOfFuel);

		txtPriceOfFuel = new JTextField();
		txtPriceOfFuel.setColumns(10);
		txtPriceOfFuel.setBounds(164, 262, 163, 36);
		contentPanel.add(txtPriceOfFuel);

		txtDriver = new JTextField();
		txtDriver.setColumns(10);
		txtDriver.setBounds(164, 308, 163, 36);
		contentPanel.add(txtDriver);

		txtService = new JTextField();
		txtService.setColumns(10);
		txtService.setBounds(164, 354, 163, 36);
		contentPanel.add(txtService);
		
		JLabel lblDay = new JLabel("Gün");
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDay.setBounds(78, 400, 54, 21);
		contentPanel.add(lblDay);
		
		JLabel lblMonth = new JLabel("Ay");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMonth.setBounds(152, 400, 54, 21);
		contentPanel.add(lblMonth);
		
		JLabel lblYear = new JLabel("Yıl");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYear.setBounds(237, 400, 54, 21);
		contentPanel.add(lblYear);
		
		JComboBox comboYear = new JComboBox();
		comboYear.setModel(new DefaultComboBoxModel(new String[] {"2023"}));
		comboYear.setBounds(237, 420, 62, 21);
		contentPanel.add(comboYear);
		
		JComboBox comboMonth = new JComboBox();
		comboMonth.setModel(new DefaultComboBoxModel(new String[] {"Aralık"}));
		comboMonth.setBounds(154, 420, 62, 21);
		contentPanel.add(comboMonth);
		
		JComboBox comboDay = new JComboBox();
		comboDay.setModel(new DefaultComboBoxModel(new String[] {"4", "5", "6", "7", "8", "9", "10"}));
		comboDay.setBounds(70, 420, 62, 21);
		contentPanel.add(comboDay);
		
		JLabel lblHour = new JLabel("Saat");
		lblHour.setHorizontalAlignment(SwingConstants.CENTER);
		lblHour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHour.setBounds(122, 451, 54, 21);
		contentPanel.add(lblHour);
		
		JLabel lblMinute = new JLabel("Dakika");
		lblMinute.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinute.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinute.setBounds(186, 451, 54, 21);
		contentPanel.add(lblMinute);
		
		JComboBox comboMinute = new JComboBox();
		comboMinute.setBounds(186, 482, 62, 21);
		contentPanel.add(comboMinute);
		
		JComboBox comboHour = new JComboBox();
		comboHour.setBounds(114, 482, 62, 21);
		contentPanel.add(comboHour);

		ActionListener whichRdBtn = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (rdBtnBus.isSelected()) {
					comboRoute.removeAllItems();
					comboRoute.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "3. Sefer", "4. Sefer" }));
					comboTypeOfFuel.removeAllItems();
					comboTypeOfFuel.setModel(new DefaultComboBoxModel(new String[] { "", "Benzin", "Motorin" }));
				} else if (rdbtnTrain.isSelected()) {
					comboRoute.removeAllItems();
					comboRoute.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "1. Sefer", "2. Sefer" }));
					comboTypeOfFuel.removeAllItems();
					comboTypeOfFuel.addItem("Elektrik");
				} else if (rdbtnAirplane.isSelected()) {
					comboRoute.removeAllItems();
					comboRoute.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "5. Sefer", "6. Sefer" }));
					comboTypeOfFuel.removeAllItems();
					comboTypeOfFuel.addItem("Gaz");
				}
			}
		};

		rdBtnBus.addActionListener(whichRdBtn);
		rdbtnTrain.addActionListener(whichRdBtn);
		rdbtnAirplane.addActionListener(whichRdBtn);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int month=0;
				switch (comboMonth.getSelectedItem().toString()) {
				case "Ocak":
					month = 1;
					break;
				case "Şubat":
					month = 2;
					break;
				case "Mart":
					month = 3;
					break;
				case "Nisan":
					month = 4;
					break;
				case "Mayıs":
					month = 5;
					break;
				case "Haziran":
					month = 6;
					break;
				case "Temmuz":
					month = 7;
					break;
				case "Ağustos":
					month = 8;
					break;
				case "Eylül":
					month = 9;
					break;
				case "Ekim":
					month = 10;
					break;
				case "Kasım":
					month = 11;
					break;
				case "Aralık":
					month = 12;
					break;
				}
				DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MMM.yyyy HH:mm");
				LocalDateTime date=LocalDateTime.of(Integer.parseInt(comboYear.getSelectedItem().toString()), month, Integer.parseInt(comboDay.getSelectedItem().toString()), 
						Integer.parseInt(comboHour.getSelectedItem().toString()), Integer.parseInt(comboMinute.getSelectedItem().toString()));
				String[] data= {txtVehicleID.getText(),(comboRoute.getSelectedItem().toString().equals("Boşta"))? "Boşta" : comboRoute.getSelectedItem().toString().substring(0, 1),comboCapacity.getSelectedItem().toString(),date.format(formatter),comboTypeOfFuel.getSelectedItem().toString(),txtPriceOfFuel.getText(),txtDriver.getText(),txtService.getText()};
				for (int i = 0; i < Vehicle.vehiclesList.size(); i++) {
					if(Vehicle.vehiclesList.get(i).getCompanyName().equals(args[9]) && Vehicle.vehiclesList.get(i).getVehicleId().equals(args[1])) {
						Vehicle v=Vehicle.vehiclesList.get(i);
						v.setVehicleId(txtVehicleID.getText());
						v.setVehicleTravelNo((comboRoute.getSelectedItem().toString().equals("Boşta"))? 0 : Integer.parseInt(comboRoute.getSelectedItem().toString().substring(0, 1)));
						v.setVehicleCapacity(Integer.parseInt(comboCapacity.getSelectedItem().toString()));
						v.setTypeFuel(comboTypeOfFuel.getSelectedItem().toString());
						v.setPriceFuel(Integer.parseInt(txtPriceOfFuel.getText()));
						v.setCostDriver(Integer.valueOf(txtDriver.getText()));
						v.setCostService(Integer.parseInt(txtService.getText()));
						v.setBeginTime(date);
					}
				}
				for (int i = 0; i < tablemodel.getColumnCount(); i++) {
					tablemodel.setValueAt(data[i], tablemodel.getSelectedRow(), i);
				}
				dispose();
			}
		});
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);;

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				String[] h=new String[24];
				for (int i = 0; i < 24; i++) {
					h[i]=String.valueOf(i);
				}
				comboHour.setModel(new DefaultComboBoxModel(h));
				String[] m=new String[60];
				for (int i = 0; i < 60; i++) {
					m[i]=String.valueOf(i);
				}
				comboMinute.setModel(new DefaultComboBoxModel(m));
				comboDay.setModel(new DefaultComboBoxModel(new String[] {"4", "5", "6", "7", "8", "9", "10"}));
				comboMonth.setModel(new DefaultComboBoxModel(new String[] {"Aralık"}));
				comboYear.setModel(new DefaultComboBoxModel(new String[] {"2023"}));
				if(args[0].equals("Bus"))
				{
					rdBtnBus.setSelected(true);
					comboRoute.removeAllItems();
					comboRoute.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "3. Sefer", "4. Sefer" }));
					comboTypeOfFuel.removeAllItems();
					comboTypeOfFuel.setModel(new DefaultComboBoxModel(new String[] { "", "Benzin", "Motorin" }));
				}else if(args[0].equals("Train")) {
					rdbtnTrain.setSelected(true);
					comboRoute.removeAllItems();
					comboRoute.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "1. Sefer", "2. Sefer" }));
					comboTypeOfFuel.removeAllItems();
					comboTypeOfFuel.addItem("Elektrik");
				}else if(args[0].equals("Airplane")) {
					rdbtnAirplane.setSelected(true);
					comboRoute.removeAllItems();
					comboRoute.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "5. Sefer", "6. Sefer" }));
					comboTypeOfFuel.removeAllItems();
					comboTypeOfFuel.addItem("Gaz");
				}
				txtVehicleID.setText(args[1]);
				comboRoute.setSelectedItem((args[2].equals("Boşta"))? "Boşta":args[2]+". Sefer");
				comboCapacity.setSelectedItem(args[3]);
				DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MMM.yyyy HH:mm");
				LocalDateTime date=LocalDateTime.parse(args[4], formatter);
				comboDay.setSelectedItem(String.valueOf(date.getDayOfMonth()));
				String month="";
				switch(date.getMonthValue()) {
				case 1:
					month="Ocak";break;
				case 2:
					month="Şubat";break;
				case 3:
					month="Mart";break;
				case 4:
					month="Nisan";break;
				case 5:
					month="Mayıs";break;
				case 6:
					month="Haziran";break;
				case 7:
					month="Temmuz";break;
				case 8:
					month="Ağustos";break;
				case 9:
					month="Eylül";break;
				case 10:
					month="Ekim";break;
				case 11:
					month="Kasım";break;
				case 12:
					month="Aralık";break;
				}
				comboMonth.setSelectedItem(month);
				comboYear.setSelectedItem(String.valueOf(date.getYear()));
				comboHour.setSelectedItem(String.valueOf(date.getHour()));
				comboMinute.setSelectedItem(String.valueOf(date.getMinute()));
				comboTypeOfFuel.setSelectedItem(args[5]);
				txtPriceOfFuel.setText(args[6]);
				txtDriver.setText(args[7]);
				txtService.setText(args[8]);
			}
		});
	}
}
