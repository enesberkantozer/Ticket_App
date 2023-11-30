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
import prolab2.Airplane;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
	public void updateRow(String[] args,DefaultTableModel tablemodel) {
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
	public UpdateVecihlePanel(String[] args,DefaultTableModel tablemodel) {
		setBounds(100, 100, 379, 473);
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

		ActionListener whichRdBtn = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (rdBtnBus.isSelected()) {
					comboRoute.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "3. Sefer", "4. Sefer" }));
					comboTypeOfFuel.setModel(new DefaultComboBoxModel(new String[] { "", "Benzin", "Motorin" }));
				} else if (rdbtnTrain.isSelected()) {
					comboRoute.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "1. Sefer", "2. Sefer" }));
					comboTypeOfFuel.removeAllItems();
					comboTypeOfFuel.addItem("Elektrik");
				} else if (rdbtnAirplane.isSelected()) {
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
				int travelNo=Integer.parseInt(comboRoute.getSelectedItem().toString().substring(0, 1));
				int capacity=Integer.parseInt(comboCapacity.getSelectedItem().toString());
				if (rdBtnBus.isSelected()) {
//					new Bus(args,txtVehicleID.getText(),capacity,travelNo,comboTypeOfFuel.getSelectedItem().toString(),Integer.parseInt(txtDriver.getText()),Integer.parseInt(txtService.getText()),Integer.parseInt(txtPriceOfFuel.getText()));
				} else if (rdbtnTrain.isSelected()) {
//					new Train(args,txtVehicleID.getText(),capacity,travelNo,comboTypeOfFuel.getSelectedItem().toString(),Integer.parseInt(txtDriver.getText()),Integer.parseInt(txtService.getText()),Integer.parseInt(txtPriceOfFuel.getText()));
				} else if (rdbtnAirplane.isSelected()) {
//					new Airplane(args,txtVehicleID.getText(),capacity,travelNo,comboTypeOfFuel.getSelectedItem().toString(),Integer.parseInt(txtDriver.getText()),Integer.parseInt(txtService.getText()),Integer.parseInt(txtPriceOfFuel.getText()));
				}
				String[] data= {txtVehicleID.getText(),comboRoute.getSelectedItem().toString().substring(0, 1),comboCapacity.getSelectedItem().toString(),comboTypeOfFuel.getSelectedItem().toString(),txtPriceOfFuel.getText(),txtDriver.getText(),txtService.getText()};
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
		buttonPane.add(cancelButton);;

		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				if(args[0].equals("Bus"))
					rdBtnBus.setSelected(true);
				else if(args[0].equals("Train"))
					rdbtnTrain.setSelected(true);
				else if(args[0].equals("Airplane"))
					rdbtnAirplane.setSelected(true);
				txtVehicleID.setText(args[1]);
				comboRoute.setSelectedItem(args[2]+". Sefer");
				comboCapacity.setSelectedItem(args[3]);
				comboTypeOfFuel.setSelectedItem(args[4]);
				txtPriceOfFuel.setText(args[5]);
				txtDriver.setText(args[6]);
				txtService.setText(args[7]);
			}
		});
	}
}
