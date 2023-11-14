package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketFrame frame = new TicketFrame();
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
	public TicketFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("30");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(86, 57, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("27");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(146, 57, 50, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("24");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(206, 57, 50, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("21");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(266, 57, 50, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("18");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(326, 57, 50, 50);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("15");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(386, 57, 50, 50);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("12");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1.setBounds(446, 57, 50, 50);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("9");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_1.setBounds(506, 57, 50, 50);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1_1 = new JButton("6");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1.setBounds(566, 57, 50, 50);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("3");
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_1_1.setBounds(626, 57, 50, 50);
		contentPane.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_5 = new JButton("29");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_5.setBounds(86, 128, 50, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("26");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2.setBounds(146, 128, 50, 50);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("23");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_2.setBounds(206, 128, 50, 50);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("20");
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_2.setBounds(266, 128, 50, 50);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_1 = new JButton("17");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4_1.setBounds(326, 128, 50, 50);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_1_1_1 = new JButton("14");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1.setBounds(386, 128, 50, 50);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("11");
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_2.setBounds(446, 128, 50, 50);
		contentPane.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_3_1_2 = new JButton("8");
		btnNewButton_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_1_2.setBounds(506, 128, 50, 50);
		contentPane.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_2_1_1_1 = new JButton("5");
		btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1_1.setBounds(566, 128, 50, 50);
		contentPane.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("2");
		btnNewButton_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_1_1_1.setBounds(626, 128, 50, 50);
		contentPane.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_6 = new JButton("28");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_6.setBounds(86, 264, 50, 50);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("25");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3.setBounds(146, 264, 50, 50);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("22");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_3.setBounds(206, 264, 50, 50);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("19");
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_3.setBounds(266, 264, 50, 50);
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_4_2 = new JButton("16");
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4_2.setBounds(326, 264, 50, 50);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_1_1_2 = new JButton("13");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_2.setBounds(386, 264, 50, 50);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_2_1_3 = new JButton("10");
		btnNewButton_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_3.setBounds(446, 264, 50, 50);
		contentPane.add(btnNewButton_2_1_3);
		
		JButton btnNewButton_3_1_3 = new JButton("7");
		btnNewButton_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_1_3.setBounds(506, 264, 50, 50);
		contentPane.add(btnNewButton_3_1_3);
		
		JButton btnNewButton_2_1_1_2 = new JButton("4");
		btnNewButton_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1_2.setBounds(566, 264, 50, 50);
		contentPane.add(btnNewButton_2_1_1_2);
		
		JButton btnNewButton_3_1_1_2 = new JButton("1");
		btnNewButton_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_1_1_2.setBounds(626, 264, 50, 50);
		contentPane.add(btnNewButton_3_1_1_2);
	}
}
