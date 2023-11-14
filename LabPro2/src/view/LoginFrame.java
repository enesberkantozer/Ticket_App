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
		comboBox.setBounds(29, 69, 75, 21);
		UserPanel.add(comboBox);
		
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
