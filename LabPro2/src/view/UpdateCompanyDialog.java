package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateCompanyDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, DefaultTableModel tablemodel, int selectedRow) {
		try {
			UpdateCompanyDialog dialog = new UpdateCompanyDialog(args,tablemodel,selectedRow);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UpdateCompanyDialog(String[] data,DefaultTableModel tablemodel, int selectedRow) {
		setBounds(100, 100, 431, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setText(data[0]);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(152, 23, 224, 34);
		contentPanel.add(textField);
		textField.setColumns(10);
		{
			textField_1 = new JTextField();
			textField_1.setText(data[1]);
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textField_1.setColumns(10);
			textField_1.setBounds(152, 67, 224, 34);
			contentPanel.add(textField_1);
		}
		{
			textField_2 = new JTextField();
			textField_2.setText(data[2]);
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textField_2.setColumns(10);
			textField_2.setBounds(152, 111, 224, 34);
			contentPanel.add(textField_2);
		}
		{
			textField_3 = new JTextField();
			textField_3.setText(data[3]);
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textField_3.setColumns(10);
			textField_3.setBounds(152, 155, 224, 34);
			contentPanel.add(textField_3);
		}
		{
			JLabel lblNewLabel = new JLabel("Firma Adı:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(22, 22, 120, 34);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblHizmetBedeli = new JLabel("Hizmet Bedeli:");
			lblHizmetBedeli.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblHizmetBedeli.setHorizontalAlignment(SwingConstants.RIGHT);
			lblHizmetBedeli.setBounds(22, 67, 120, 34);
			contentPanel.add(lblHizmetBedeli);
		}
		{
			JLabel lblKullancAd = new JLabel("Kullanıcı Adı:");
			lblKullancAd.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblKullancAd.setHorizontalAlignment(SwingConstants.RIGHT);
			lblKullancAd.setBounds(22, 111, 120, 34);
			contentPanel.add(lblKullancAd);
		}
		{
			JLabel lblifre = new JLabel("Şifre:");
			lblifre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblifre.setHorizontalAlignment(SwingConstants.RIGHT);
			lblifre.setBounds(22, 155, 120, 34);
			contentPanel.add(lblifre);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String[] data= {textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText()};
						for (int i = 0; i < data.length; i++) {
							tablemodel.setValueAt(data[i], selectedRow, i);
						}
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
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
	}
}
