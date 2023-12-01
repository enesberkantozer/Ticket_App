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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public AddVecihlePanel() {
		
	}

	/**
	 * Launch the application.
	 */
	public void addRow(String args,DefaultTableModel tablemodel) {
		try {
			AddVecihlePanel dialog = new AddVecihlePanel(args,tablemodel);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddVecihlePanel(String args,DefaultTableModel tablemodel) {
		setBounds(100, 100, 379, 590);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Otobüs");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(10, 23, 81, 36);
		contentPanel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnTren = new JRadioButton("Tren");
		rdbtnTren.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnTren.setBounds(124, 23, 91, 36);
		contentPanel.add(rdbtnTren);

		JRadioButton rdbtnUak = new JRadioButton("Uçak");
		rdbtnUak.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnUak.setBounds(236, 23, 91, 36);
		contentPanel.add(rdbtnUak);

		ButtonGroup radioButtons = new ButtonGroup();
		radioButtons.add(rdbtnNewRadioButton);
		radioButtons.add(rdbtnTren);
		radioButtons.add(rdbtnUak);

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

		textField = new JTextField();
		textField.setBounds(164, 81, 163, 36);
		contentPanel.add(textField);
		textField.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(164, 130, 163, 30);
		contentPanel.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "15", "20", "25", "30" }));
		comboBox_1.setBounds(164, 176, 163, 30);
		contentPanel.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(164, 222, 163, 30);
		contentPanel.add(comboBox_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(164, 262, 163, 36);
		contentPanel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(164, 308, 163, 36);
		contentPanel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(164, 354, 163, 36);
		contentPanel.add(textField_3);
		
		JComboBox comboDay = new JComboBox();
		comboDay.setModel(new DefaultComboBoxModel(new String[] {"4", "5", "6", "7", "8", "9", "10"}));
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
		comboMonth.setModel(new DefaultComboBoxModel(new String[] {"Aralık"}));
		comboMonth.setBounds(153, 420, 62, 21);
		contentPanel.add(comboMonth);
		
		JComboBox comboYear = new JComboBox();
		comboYear.setModel(new DefaultComboBoxModel(new String[] {"2023"}));
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
		String[] h=new String[24];
		for (int i = 0; i < 24; i++) {
			h[i]=String.valueOf(i);
		}
		comboHour.setModel(new DefaultComboBoxModel(h));
		comboHour.setBounds(113, 482, 62, 21);
		contentPanel.add(comboHour);
		
		JComboBox comboMinute = new JComboBox();
		String[] m=new String[60];
		for (int i = 0; i < 60; i++) {
			m[i]=String.valueOf(i);
		}
		comboMinute.setModel(new DefaultComboBoxModel(m));
		comboMinute.setBounds(185, 482, 62, 21);
		contentPanel.add(comboMinute);

		ActionListener whichRdBtn = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (rdbtnNewRadioButton.isSelected()) {
					comboBox.removeAllItems();
					comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "3. Sefer", "4. Sefer" }));
					comboBox_2.removeAllItems();
					comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "Benzin", "Motorin" }));
				} else if (rdbtnTren.isSelected()) {
					comboBox.removeAllItems();
					comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "1. Sefer", "2. Sefer" }));
					comboBox_2.removeAllItems();
					comboBox_2.addItem("Elektrik");
				} else if (rdbtnUak.isSelected()) {
					comboBox.removeAllItems();
					comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Boşta", "5. Sefer", "6. Sefer" }));
					comboBox_2.removeAllItems();
					comboBox_2.addItem("Gaz");
				}
			}
		};

		rdbtnNewRadioButton.addActionListener(whichRdBtn);
		rdbtnTren.addActionListener(whichRdBtn);
		rdbtnUak.addActionListener(whichRdBtn);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalDateTime date=LocalDateTime.of(Integer.parseInt(comboYear.getSelectedItem().toString()),
						Integer.parseInt(comboMonth.getSelectedItem().toString()),
						Integer.parseInt(comboDay.getSelectedItem().toString()),
						Integer.parseInt(comboHour.getSelectedItem().toString()),
						Integer.parseInt(comboMinute.getSelectedItem().toString()));
				int travelNo=Integer.parseInt(comboBox.getSelectedItem().toString().substring(0, 1));
				int capacity=Integer.parseInt(comboBox_1.getSelectedItem().toString());
				if (rdbtnNewRadioButton.isSelected()) {
					new Bus(args,textField.getText(),capacity,date,travelNo,comboBox_2.getSelectedItem().toString(),Integer.parseInt(textField_2.getText()),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_1.getText()));
				} else if (rdbtnTren.isSelected()) {
					new Train(args,textField.getText(),capacity,date,travelNo,comboBox_2.getSelectedItem().toString(),Integer.parseInt(textField_2.getText()),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_1.getText()));
				} else if (rdbtnUak.isSelected()) {
					new Airplane(args,textField.getText(),capacity,date,travelNo,comboBox_2.getSelectedItem().toString(),Integer.parseInt(textField_2.getText()),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_1.getText()));
				}
				String[] data= {textField.getText(),comboBox.getSelectedItem().toString().substring(0, 1),comboBox_1.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString(),textField_1.getText(),textField_2.getText(),textField_3.getText()};
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
