package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import prolab2.Company;
import prolab2.ControlLogin;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public void execute(int selectedTab) {
		setVisible(true);
		setTitle("Hoş Geldiniz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoş Geldiniz");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 766, 77);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 98, 766, 355);
		contentPane.add(tabbedPane);
		
		JPanel UserPanel = new JPanel();
		tabbedPane.addTab("Kullanıcı", null, UserPanel, null);
		UserPanel.setLayout(null);
		
		JComboBox beginRouteComboBox = new JComboBox();
		beginRouteComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya"}));
		beginRouteComboBox.setBounds(32, 49, 103, 35);
		UserPanel.add(beginRouteComboBox);
		
		JComboBox endRouteComboBox = new JComboBox();
		endRouteComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya"}));
		endRouteComboBox.setBounds(166, 49, 103, 35);
		UserPanel.add(endRouteComboBox);
		
		JComboBox dayComboBox = new JComboBox();
		dayComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "4", "5", "6", "7", "8", "9", "10"}));
		dayComboBox.setBounds(374, 49, 103, 35);
		UserPanel.add(dayComboBox);
		
		JComboBox monthComboBox = new JComboBox();
		monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Kasım"}));
		monthComboBox.setBounds(500, 49, 103, 35);
		UserPanel.add(monthComboBox);
		
		JComboBox yearComboBox = new JComboBox();
		yearComboBox.setModel(new DefaultComboBoxModel(new String[] {"2023"}));
		yearComboBox.setBounds(622, 49, 103, 35);
		UserPanel.add(yearComboBox);
		
		JLabel lblBeginRoute = new JLabel("Kalkış");
		lblBeginRoute.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBeginRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeginRoute.setBounds(32, 10, 103, 29);
		UserPanel.add(lblBeginRoute);
		
		JLabel lblEndRoute = new JLabel("Varış");
		lblEndRoute.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEndRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndRoute.setBounds(166, 10, 103, 29);
		UserPanel.add(lblEndRoute);
		
		JLabel lblDay = new JLabel("Gün");
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setBounds(374, 10, 103, 29);
		UserPanel.add(lblDay);
		
		JLabel lblMonth = new JLabel("Ay");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setBounds(500, 10, 103, 29);
		UserPanel.add(lblMonth);
		
		JLabel lblYear = new JLabel("Yıl");
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(622, 10, 103, 29);
		UserPanel.add(lblYear);
		
		JLabel lblArrow = new JLabel("→");
		lblArrow.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblArrow.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrow.setBounds(134, 49, 32, 35);
		UserPanel.add(lblArrow);
		
		JButton btnUserLogin = new JButton("Sefer Ara");
		btnUserLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUserLogin.setBounds(285, 222, 201, 61);
		UserPanel.add(btnUserLogin);
		
		JPanel CompanyPanel = new JPanel();
		CompanyPanel.setLayout(null);
		tabbedPane.addTab("Firma", null, CompanyPanel, null);
		
		JTextField companyUsername = new JTextField();
		companyUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		companyUsername.setColumns(10);
		companyUsername.setBounds(220, 53, 300, 50);
		CompanyPanel.add(companyUsername);
		
		JPasswordField companyPassword = new JPasswordField();
		companyPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		companyPassword.setBounds(220, 146, 300, 50);
		CompanyPanel.add(companyPassword);
		
		JLabel lblCompanyUsername = new JLabel("Kullanıcı Adı:");
		lblCompanyUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCompanyUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCompanyUsername.setBounds(10, 53, 186, 50);
		CompanyPanel.add(lblCompanyUsername);
		
		JLabel lblCompanyPassword = new JLabel("Şifre:");
		lblCompanyPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCompanyPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCompanyPassword.setBounds(10, 146, 186, 50);
		CompanyPanel.add(lblCompanyPassword);
		
		JLabel lblCompanyErrorMessage = new JLabel("");
		lblCompanyErrorMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyErrorMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCompanyErrorMessage.setBounds(10, 7, 741, 36);
		CompanyPanel.add(lblCompanyErrorMessage);
		
		JButton btnCompanyLogin = new JButton("Giriş Yap");
		btnCompanyLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlLogin controlLogin=new ControlLogin();
				Company openCompany=controlLogin.getCompany(companyUsername.getText(), companyPassword.getText());
				if(openCompany!=null) {
					CompanyFrame.execute(null, openCompany);
					dispose();
				}else {
					lblCompanyErrorMessage.setText("Kullanıcı adı veya şifre yanlış");
				}
			}
		});
		btnCompanyLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCompanyLogin.setBounds(228, 230, 171, 50);
		CompanyPanel.add(btnCompanyLogin);
		
		JPanel AdminPanel = new JPanel();
		tabbedPane.addTab("Admin", null, AdminPanel, null);
		AdminPanel.setLayout(null);
		
		JTextField adminUsername = new JTextField();
		adminUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		adminUsername.setBounds(220, 53, 300, 50);
		AdminPanel.add(adminUsername);
		adminUsername.setColumns(10);
		
		JPasswordField adminPassword = new JPasswordField();
		adminPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		adminPassword.setBounds(220, 146, 300, 50);
		AdminPanel.add(adminPassword);
		
		JLabel lblAdminUsername = new JLabel("Kullanıcı Adı:");
		lblAdminUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdminUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdminUsername.setBounds(10, 53, 186, 50);
		AdminPanel.add(lblAdminUsername);
		
		JLabel lblAdminPassword = new JLabel("Şifre:");
		lblAdminPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdminPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdminPassword.setBounds(10, 146, 186, 50);
		AdminPanel.add(lblAdminPassword);
		
		JButton btnAdminLogin = new JButton("Giriş Yap");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFrame adminFrame= new AdminFrame();
				adminFrame.execute();
				dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdminLogin.setBounds(203, 214, 171, 50);
		AdminPanel.add(btnAdminLogin);
		
		tabbedPane.setSelectedIndex(selectedTab);
	}
}
