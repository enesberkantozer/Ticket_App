package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setTitle("Hoş Geldiniz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 98, 766, 355);
		contentPane.add(tabbedPane);
		
		JPanel UserPanel = new JPanel();
		tabbedPane.addTab("Kullanıcı", null, UserPanel, null);
		UserPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya"}));
		comboBox.setBounds(32, 49, 103, 35);
		UserPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya"}));
		comboBox_1.setBounds(166, 49, 103, 35);
		UserPanel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(374, 49, 103, 35);
		UserPanel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Kasım"}));
		comboBox_3.setBounds(500, 49, 103, 35);
		UserPanel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"2023"}));
		comboBox_4.setBounds(622, 49, 103, 35);
		UserPanel.add(comboBox_4);
		
		JLabel lblNewLabel_2 = new JLabel("Kalkış");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(32, 10, 103, 29);
		UserPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Varış");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(166, 10, 103, 29);
		UserPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Gün");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(374, 10, 103, 29);
		UserPanel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Ay");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setBounds(500, 10, 103, 29);
		UserPanel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Yıl");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setBounds(622, 10, 103, 29);
		UserPanel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3 = new JLabel("→");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(134, 49, 32, 35);
		UserPanel.add(lblNewLabel_3);
		
		JPanel CompanyPanel = new JPanel();
		CompanyPanel.setLayout(null);
		tabbedPane.addTab("Firma", null, CompanyPanel, null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(220, 53, 300, 50);
		CompanyPanel.add(textField_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField_1.setBounds(220, 146, 300, 50);
		CompanyPanel.add(passwordField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Kullanıcı Adı:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(10, 53, 186, 50);
		CompanyPanel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Şifre:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 146, 186, 50);
		CompanyPanel.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Giriş Yap");
		btnNewButton_1.setBackground(getForeground());
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(203, 214, 171, 50);
		CompanyPanel.add(btnNewButton_1);
		
		JPanel AdminPanel = new JPanel();
		tabbedPane.addTab("Admin", null, AdminPanel, null);
		AdminPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(220, 53, 300, 50);
		AdminPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(220, 146, 300, 50);
		AdminPanel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Kullanıcı Adı:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 53, 186, 50);
		AdminPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Şifre:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 146, 186, 50);
		AdminPanel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Giriş Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCompany.main(null);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(203, 214, 171, 50);
		AdminPanel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Hoş Geldiniz");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 766, 77);
		contentPane.add(lblNewLabel);
	}
}
