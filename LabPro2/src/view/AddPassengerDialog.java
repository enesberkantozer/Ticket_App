package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import prolab2.Company;
import prolab2.Reservation;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;

public class AddPassengerDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtTcID;

	/**
	 * Create the dialog.
	 */
	public AddPassengerDialog(JButton button,String trip[],LocalDateTime date) {
		JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setBounds(100, 100, 453, 293);
		dialog.getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		dialog.getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblName = new JLabel("İsim:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(10, 10, 133, 46);
		contentPanel.add(lblName);

		JLabel lblSurname = new JLabel("Soyisim:");
		lblSurname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSurname.setBounds(10, 70, 133, 46);
		contentPanel.add(lblSurname);

		JLabel lblTcID = new JLabel("TC Kimlik Nu:");
		lblTcID.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTcID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTcID.setBounds(10, 126, 133, 46);
		contentPanel.add(lblTcID);

		txtName = new JTextField();
		txtName.setBounds(153, 10, 245, 46);
		contentPanel.add(txtName);
		txtName.setColumns(10);

		txtSurname = new JTextField();
		txtSurname.setColumns(10);
		txtSurname.setBounds(153, 70, 245, 46);
		contentPanel.add(txtSurname);

		txtTcID = new JTextField();
		txtTcID.setColumns(10);
		txtTcID.setBounds(153, 126, 245, 46);
		contentPanel.add(txtTcID);

		JLabel lblErrorMessage = new JLabel("");
		lblErrorMessage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErrorMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorMessage.setBounds(10, 182, 419, 33);
		contentPanel.add(lblErrorMessage);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		dialog.getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		dialog.setVisible(true);

		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (txtName.getText().equals("") && txtSurname.getText().equals("")
							&& txtTcID.getText().equals("")) {
						lblErrorMessage.setText("Değerleri doğru giriniz!");
					} else {
						Reservation passenger = new Reservation(txtName.getText(), txtSurname.getText(),
								Integer.parseInt(txtTcID.getText()), date);
						for (int i = 0; i < Company.companysList.size(); i++) {
							if(Company.companysList.get(i).getCompanyName().equals(trip[3])) {
								Company.companysList.get(i).addPsngrPrice(trip);
								button.setEnabled(false);
								dialog.dispose();
							}
						}
					}
				} catch (Exception error) {
					lblErrorMessage.setText("Değerleri kontrol ediniz!");
					error.printStackTrace();
				}
			}
		});
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		dialog.getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
			}
		});
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
	}
}
