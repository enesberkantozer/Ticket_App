package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import prolab2.Company;
import prolab2.Storage;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AddCompanyDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField companyName;
	private JTextField username;
	private JTextField password;

	/**
	 * Create the dialog.
	 */
	public void addRow(DefaultTableModel tableModel) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 431, 229);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		companyName = new JTextField();
		companyName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		companyName.setBounds(152, 23, 224, 34);
		contentPanel.add(companyName);
		companyName.setColumns(10);

		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 13));
		username.setColumns(10);
		username.setBounds(152, 67, 224, 34);
		contentPanel.add(username);

		password = new JTextField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 13));
		password.setColumns(10);
		password.setBounds(152, 111, 224, 34);
		contentPanel.add(password);

		JLabel lblCompanyName = new JLabel("Firma Adı:");
		lblCompanyName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCompanyName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCompanyName.setBounds(22, 22, 120, 34);
		contentPanel.add(lblCompanyName);

		JLabel lblUsername = new JLabel("Kullanıcı Adı:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(22, 67, 120, 34);
		contentPanel.add(lblUsername);

		JLabel lblPassword = new JLabel("Şifre:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(22, 111, 120, 34);
		contentPanel.add(lblPassword);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("ONAYLA");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Company company = new Company(companyName.getText(), username.getText(), password.getText());
				Storage.addCompanyData(company);
				String[] data = { companyName.getText(), username.getText(), password.getText() };
				tableModel.addRow(data);
				dispose();
			}
		});
		okButton.setActionCommand("ONAYLA");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("İPTAL ET");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setActionCommand("İPTAL ET");
		buttonPane.add(cancelButton);
	}

}