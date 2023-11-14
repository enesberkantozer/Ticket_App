package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Vehicle50 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehicle50 frame = new Vehicle50();
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
	public Vehicle50() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("48");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(96, 167, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("43");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(156, 167, 50, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("38");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(216, 167, 50, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("33");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(276, 167, 50, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("28");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(336, 167, 50, 50);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("23");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(396, 167, 50, 50);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("18");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(456, 167, 50, 50);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("13");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1.setBounds(516, 167, 50, 50);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1_1 = new JButton("8");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1.setBounds(576, 167, 50, 50);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("3");
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1.setBounds(636, 167, 50, 50);
		contentPane.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_5 = new JButton("47");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(96, 296, 50, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("42");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(156, 296, 50, 50);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("37");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_2.setBounds(216, 296, 50, 50);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("32");
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_2.setBounds(276, 296, 50, 50);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_1 = new JButton("27");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_1.setBounds(336, 296, 50, 50);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_1_1_1 = new JButton("22");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_1.setBounds(396, 296, 50, 50);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("17");
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_2.setBounds(456, 296, 50, 50);
		contentPane.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_3_1_2 = new JButton("12");
		btnNewButton_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_2.setBounds(516, 296, 50, 50);
		contentPane.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_2_1_1_1 = new JButton("7");
		btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_1.setBounds(576, 296, 50, 50);
		contentPane.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("2");
		btnNewButton_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_1.setBounds(636, 296, 50, 50);
		contentPane.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_6 = new JButton("46");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(96, 372, 50, 50);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("41");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_3.setBounds(156, 372, 50, 50);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("36");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_3.setBounds(216, 372, 50, 50);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("31");
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_3.setBounds(276, 372, 50, 50);
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_4_2 = new JButton("26");
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_2.setBounds(336, 372, 50, 50);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_1_1_2 = new JButton("21");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_2.setBounds(396, 372, 50, 50);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_2_1_3 = new JButton("16");
		btnNewButton_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_3.setBounds(456, 372, 50, 50);
		contentPane.add(btnNewButton_2_1_3);
		
		JButton btnNewButton_3_1_3 = new JButton("11");
		btnNewButton_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_3.setBounds(516, 372, 50, 50);
		contentPane.add(btnNewButton_3_1_3);
		
		JButton btnNewButton_2_1_1_2 = new JButton("6");
		btnNewButton_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_2.setBounds(576, 372, 50, 50);
		contentPane.add(btnNewButton_2_1_1_2);
		
		JButton btnNewButton_3_1_1_2 = new JButton("1");
		btnNewButton_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_2.setBounds(636, 372, 50, 50);
		contentPane.add(btnNewButton_3_1_1_2);
		
		JButton btnNewButton_7 = new JButton("50");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(96, 23, 50, 50);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_1_4 = new JButton("45");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_4.setBounds(156, 23, 50, 50);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_2_4 = new JButton("40");
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_4.setBounds(216, 23, 50, 50);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_3_4 = new JButton("35");
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_4.setBounds(276, 23, 50, 50);
		contentPane.add(btnNewButton_3_4);
		
		JButton btnNewButton_4_3 = new JButton("30");
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_3.setBounds(336, 23, 50, 50);
		contentPane.add(btnNewButton_4_3);
		
		JButton btnNewButton_1_1_3 = new JButton("25");
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_3.setBounds(396, 23, 50, 50);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_2_1_4 = new JButton("20");
		btnNewButton_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_4.setBounds(456, 23, 50, 50);
		contentPane.add(btnNewButton_2_1_4);
		
		JButton btnNewButton_3_1_4 = new JButton("15");
		btnNewButton_3_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_4.setBounds(516, 23, 50, 50);
		contentPane.add(btnNewButton_3_1_4);
		
		JButton btnNewButton_2_1_1_3 = new JButton("10");
		btnNewButton_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_3.setBounds(576, 23, 50, 50);
		contentPane.add(btnNewButton_2_1_1_3);
		
		JButton btnNewButton_3_1_1_3 = new JButton("5");
		btnNewButton_3_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_3.setBounds(636, 23, 50, 50);
		contentPane.add(btnNewButton_3_1_1_3);
		
		JButton btnNewButton_8 = new JButton("49");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(96, 93, 50, 50);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_1_5 = new JButton("44");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_5.setBounds(156, 93, 50, 50);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_2_5 = new JButton("39");
		btnNewButton_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_5.setBounds(216, 93, 50, 50);
		contentPane.add(btnNewButton_2_5);
		
		JButton btnNewButton_3_5 = new JButton("34");
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_5.setBounds(276, 93, 50, 50);
		contentPane.add(btnNewButton_3_5);
		
		JButton btnNewButton_4_4 = new JButton("29");
		btnNewButton_4_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_4.setBounds(336, 93, 50, 50);
		contentPane.add(btnNewButton_4_4);
		
		JButton btnNewButton_1_1_4 = new JButton("24");
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_4.setBounds(396, 93, 50, 50);
		contentPane.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_2_1_5 = new JButton("19");
		btnNewButton_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_5.setBounds(456, 93, 50, 50);
		contentPane.add(btnNewButton_2_1_5);
		
		JButton btnNewButton_3_1_5 = new JButton("14");
		btnNewButton_3_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_5.setBounds(516, 93, 50, 50);
		contentPane.add(btnNewButton_3_1_5);
		
		JButton btnNewButton_2_1_1_4 = new JButton("9");
		btnNewButton_2_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_4.setBounds(576, 93, 50, 50);
		contentPane.add(btnNewButton_2_1_1_4);
		
		JButton btnNewButton_3_1_1_4 = new JButton("4");
		btnNewButton_3_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_4.setBounds(636, 93, 50, 50);
		contentPane.add(btnNewButton_3_1_1_4);
	}
}