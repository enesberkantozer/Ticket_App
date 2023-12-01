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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import prolab2.Bus;
import prolab2.Train;
import prolab2.Airplane;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class AddVecihlePanel extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtVehicleID;
	private JTextField txtPriceOfFuel;
	private JTextField txtDriver;
	private JTextField txtService;

	public AddVecihlePanel() {

	}

	/**
	 * Launch the application.
	 */
	public void addRow(String args, DefaultTableModel tablemodel) {
		try {
			AddVecihlePanel dialog = new AddVecihlePanel(args, tablemodel);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddVecihlePanel(String args, DefaultTableModel tablemodel) {
		setBounds(100, 100, 379, 590);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JRadioButton rdbtnBus = new JRadioButton("Otobüs");
		rdbtnBus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnBus.setBounds(10, 23, 81, 36);
		contentPanel.add(rdbtnBus);

		JRadioButton rdbtnTrain = new JRadioButton("Tren");
		rdbtnTrain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnTrain.setBounds(124, 23, 91, 36);
		contentPanel.add(rdbtnTrain);

		JRadioButton rdbtnAirplane = new JRadioButton("Uçak");
		rdbtnAirplane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAirplane.setBounds(236, 23, 91, 36);
		contentPanel.add(rdbtnAirplane);

		ButtonGroup radioButtons = new ButtonGroup();
		radioButtons.add(rdbtnBus);
		radioButtons.add(rdbtnTrain);
		radioButtons.add(rdbtnAirplane);

		JLabel lblVehicleID = new JLabel("Araç ID:\r\n");
		lblVehicleID.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVehicleID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVehicleID.setBounds(10, 78, 144, 36);
		contentPanel.add(lblVehicleID);

		JLabel lblRoute = new JLabel("Durum:");
		lblRoute.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRoute.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRoute.setBounds(10, 124, 144, 36);
		contentPanel.add(lblRoute);

		JLabel lblCapacity = new JLabel("Kapasite:");
		lblCapacity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCapacity.setBounds(10, 170, 144, 36);
		contentPanel.add(lblCapacity);

		JLabel lblTypeOfFuel = new JLabel("Yakıt Tipi:");
		lblTypeOfFuel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTypeOfFuel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTypeOfFuel.setBounds(10, 216, 144, 36);
		contentPanel.add(lblTypeOfFuel);

		JLabel lblPriceOfFuel = new JLabel("Yakıt Maliyeti:");
		lblPriceOfFuel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPriceOfFuel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceOfFuel.setBounds(10, 262, 144, 36);
		contentPanel.add(lblPriceOfFuel);

		JLabel lblDriver = new JLabel("Çalışan Ücreti:");
		lblDriver.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDriver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDriver.setBounds(10, 308, 144, 36);
		contentPanel.add(lblDriver);

		JLabel lblService = new JLabel("Servis Ücreti:");
		lblService.setHorizontalAlignment(SwingConstants.RIGHT);
		lblService.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService.setBounds(10, 354, 144, 36);
		contentPanel.add(lblService);

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

		JComboBox comboDay = new JComboBox();
		comboDay.setModel(new DefaultComboBoxModel(new String[] { "4", "5", "6", "7", "8", "9", "10" }));
		comboDay.setBounds(69, 420, 62, 21);
		contentPanel.add(comboDay);

		JLabel lblDay = new JLabel("Gün");
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDay.setBounds(77, 400, 54, 21);
		contentPanel.add(lblDay);

		JLabel lblMonth = new JLabel("Ay");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMonth.setBounds(151, 400, 54, 21);
		contentPanel.add(lblMonth);

		JLabel lblYear = new JLabel("Yıl");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYear.setBounds(236, 400, 54, 21);
		contentPanel.add(lblYear);

		JComboBox comboMonth = new JComboBox();
		comboMonth.setModel(new DefaultComboBoxModel(new String[] { "Aralık" }));
		comboMonth.setBounds(153, 420, 62, 21);
		contentPanel.add(comboMonth);

		JComboBox comboYear = new JComboBox();
		comboYear.setModel(new DefaultComboBoxModel(new String[] { "2023" }));
		comboYear.setBounds(236, 420, 62, 21);
		contentPanel.add(comboYear);

		JLabel lblHour = new JLabel("Saat");
		lblHour.setHorizontalAlignment(SwingConstants.CENTER);
		lblHour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHour.setBounds(121, 451, 54, 21);
		contentPanel.add(lblHour);

		JLabel lblMinute = new JLabel("Dakika");
		lblMinute.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinute.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinute.setBounds(185, 451, 54, 21);
		contentPanel.add(lblMinute);

		JComboBox comboHour = new JComboBox();
		String[] h = new String[24];
		for (int i = 0; i < 24; i++) {
			h[i] = String.valueOf(i);
		}
		comboHour.setModel(new DefaultComboBoxModel(h));
		comboHour.setBounds(113, 482, 62, 21);
		contentPanel.add(comboHour);

		JComboBox comboMinute = new JComboBox();
		String[] m = new String[60];
		for (int i = 0; i < 60; i++) {
			m[i] = String.valueOf(i);
		}
		comboMinute.setModel(new DefaultComboBoxModel(m));
		comboMinute.setBounds(185, 482, 62, 21);
		contentPanel.add(comboMinute);

		ActionListener whichRdBtn = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (rdbtnBus.isSelected()) {
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

		rdbtnBus.addActionListener(whichRdBtn);
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
				LocalDateTime date = LocalDateTime.of(Integer.parseInt(comboYear.getSelectedItem().toString()),month,
						Integer.parseInt(comboDay.getSelectedItem().toString()),
						Integer.parseInt(comboHour.getSelectedItem().toString()),
						Integer.parseInt(comboMinute.getSelectedItem().toString()));
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MMM.yyyy HH:mm");
				int travelNo = Integer.parseInt(comboRoute.getSelectedItem().toString().substring(0, 1));
				int capacity = Integer.parseInt(comboCapacity.getSelectedItem().toString());
				if (rdbtnBus.isSelected()) {
					new Bus(args, txtVehicleID.getText(), capacity, date, travelNo,
							comboTypeOfFuel.getSelectedItem().toString(), Integer.parseInt(txtDriver.getText()),
							Integer.parseInt(txtService.getText()), Integer.parseInt(txtPriceOfFuel.getText()));
				} else if (rdbtnTrain.isSelected()) {
					new Train(args, txtVehicleID.getText(), capacity, date, travelNo,
							comboTypeOfFuel.getSelectedItem().toString(), Integer.parseInt(txtDriver.getText()),
							Integer.parseInt(txtService.getText()), Integer.parseInt(txtPriceOfFuel.getText()));
				} else if (rdbtnAirplane.isSelected()) {
					new Airplane(args, txtVehicleID.getText(), capacity, date, travelNo,
							comboTypeOfFuel.getSelectedItem().toString(), Integer.parseInt(txtDriver.getText()),
							Integer.parseInt(txtService.getText()), Integer.parseInt(txtPriceOfFuel.getText()));
				}
				String[] data = { txtVehicleID.getText(), comboRoute.getSelectedItem().toString().substring(0, 1),
						comboCapacity.getSelectedItem().toString(), date.format(formatter),
						comboTypeOfFuel.getSelectedItem().toString(), txtPriceOfFuel.getText(), txtDriver.getText(),
						txtService.getText() };
				tablemodel.addRow(data);
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
		buttonPane.add(cancelButton);

	}
}
