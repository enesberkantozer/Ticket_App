package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Vehicle60 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehicle60 frame = new Vehicle60();
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
	public Vehicle60() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("58");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(98, 140, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("52");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(158, 140, 50, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("46");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(218, 140, 50, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("40");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(278, 140, 50, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("34");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(338, 140, 50, 50);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("28");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(398, 140, 50, 50);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("22");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(458, 140, 50, 50);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("16");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1.setBounds(518, 140, 50, 50);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1_1 = new JButton("10");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1.setBounds(578, 140, 50, 50);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("4");
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1.setBounds(638, 140, 50, 50);
		contentPane.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_5 = new JButton("56");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(98, 337, 50, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("50");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(158, 337, 50, 50);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("44");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_2.setBounds(218, 337, 50, 50);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("38");
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_2.setBounds(278, 337, 50, 50);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_1 = new JButton("32");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_1.setBounds(338, 337, 50, 50);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_1_1_1 = new JButton("26");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_1.setBounds(398, 337, 50, 50);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("20");
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_2.setBounds(458, 337, 50, 50);
		contentPane.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_3_1_2 = new JButton("14");
		btnNewButton_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_2.setBounds(518, 337, 50, 50);
		contentPane.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_2_1_1_1 = new JButton("8");
		btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_1.setBounds(578, 337, 50, 50);
		contentPane.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("2");
		btnNewButton_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_1.setBounds(638, 337, 50, 50);
		contentPane.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_6 = new JButton("55");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(98, 403, 50, 50);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("49");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_3.setBounds(158, 403, 50, 50);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("43");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_3.setBounds(218, 403, 50, 50);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("37");
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_3.setBounds(278, 403, 50, 50);
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_4_2 = new JButton("31");
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_2.setBounds(338, 403, 50, 50);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_1_1_2 = new JButton("25");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_2.setBounds(398, 403, 50, 50);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_2_1_3 = new JButton("19");
		btnNewButton_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_3.setBounds(458, 403, 50, 50);
		contentPane.add(btnNewButton_2_1_3);
		
		JButton btnNewButton_3_1_3 = new JButton("13");
		btnNewButton_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_3.setBounds(518, 403, 50, 50);
		contentPane.add(btnNewButton_3_1_3);
		
		JButton btnNewButton_2_1_1_2 = new JButton("7");
		btnNewButton_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_2.setBounds(578, 403, 50, 50);
		contentPane.add(btnNewButton_2_1_1_2);
		
		JButton btnNewButton_3_1_1_2 = new JButton("1");
		btnNewButton_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_2.setBounds(638, 403, 50, 50);
		contentPane.add(btnNewButton_3_1_1_2);
		
		JButton btnNewButton_7 = new JButton("60");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(98, 10, 50, 50);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_1_4 = new JButton("54");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_4.setBounds(158, 10, 50, 50);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_2_4 = new JButton("48");
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_4.setBounds(218, 10, 50, 50);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_3_4 = new JButton("42");
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_4.setBounds(278, 10, 50, 50);
		contentPane.add(btnNewButton_3_4);
		
		JButton btnNewButton_4_3 = new JButton("36");
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_3.setBounds(338, 10, 50, 50);
		contentPane.add(btnNewButton_4_3);
		
		JButton btnNewButton_1_1_3 = new JButton("30");
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_3.setBounds(398, 10, 50, 50);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_2_1_4 = new JButton("24");
		btnNewButton_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_4.setBounds(458, 10, 50, 50);
		contentPane.add(btnNewButton_2_1_4);
		
		JButton btnNewButton_3_1_4 = new JButton("18");
		btnNewButton_3_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_4.setBounds(518, 10, 50, 50);
		contentPane.add(btnNewButton_3_1_4);
		
		JButton btnNewButton_2_1_1_3 = new JButton("12");
		btnNewButton_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_3.setBounds(578, 10, 50, 50);
		contentPane.add(btnNewButton_2_1_1_3);
		
		JButton btnNewButton_3_1_1_3 = new JButton("6");
		btnNewButton_3_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_3.setBounds(638, 10, 50, 50);
		contentPane.add(btnNewButton_3_1_1_3);
		
		JButton btnNewButton_8 = new JButton("59");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(98, 70, 50, 50);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_1_5 = new JButton("53");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_5.setBounds(158, 70, 50, 50);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_2_5 = new JButton("47");
		btnNewButton_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_5.setBounds(218, 70, 50, 50);
		contentPane.add(btnNewButton_2_5);
		
		JButton btnNewButton_3_5 = new JButton("41");
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_5.setBounds(278, 70, 50, 50);
		contentPane.add(btnNewButton_3_5);
		
		JButton btnNewButton_4_4 = new JButton("35");
		btnNewButton_4_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_4.setBounds(338, 70, 50, 50);
		contentPane.add(btnNewButton_4_4);
		
		JButton btnNewButton_1_1_4 = new JButton("29");
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_4.setBounds(398, 70, 50, 50);
		contentPane.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_2_1_5 = new JButton("23");
		btnNewButton_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_5.setBounds(458, 70, 50, 50);
		contentPane.add(btnNewButton_2_1_5);
		
		JButton btnNewButton_3_1_5 = new JButton("17");
		btnNewButton_3_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_5.setBounds(518, 70, 50, 50);
		contentPane.add(btnNewButton_3_1_5);
		
		JButton btnNewButton_2_1_1_4 = new JButton("11");
		btnNewButton_2_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_4.setBounds(578, 70, 50, 50);
		contentPane.add(btnNewButton_2_1_1_4);
		
		JButton btnNewButton_3_1_1_4 = new JButton("5");
		btnNewButton_3_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_4.setBounds(638, 70, 50, 50);
		contentPane.add(btnNewButton_3_1_1_4);
		
		JButton btnNewButton_1_2_1 = new JButton("51");
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2_1.setBounds(158, 267, 50, 50);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_5_1 = new JButton("57");
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5_1.setBounds(98, 267, 50, 50);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_2_2_1 = new JButton("45");
		btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_2_1.setBounds(218, 267, 50, 50);
		contentPane.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_3_2_1 = new JButton("39");
		btnNewButton_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_2_1.setBounds(278, 267, 50, 50);
		contentPane.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_4_1_1 = new JButton("33");
		btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_1_1.setBounds(338, 267, 50, 50);
		contentPane.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("27");
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_1_1.setBounds(398, 267, 50, 50);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_2_1_2_1 = new JButton("21");
		btnNewButton_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_2_1.setBounds(458, 267, 50, 50);
		contentPane.add(btnNewButton_2_1_2_1);
		
		JButton btnNewButton_3_1_2_1 = new JButton("15");
		btnNewButton_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_2_1.setBounds(518, 267, 50, 50);
		contentPane.add(btnNewButton_3_1_2_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("9");
		btnNewButton_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1_1_1_1.setBounds(578, 267, 50, 50);
		contentPane.add(btnNewButton_2_1_1_1_1);
		
		JButton btnNewButton_3_1_1_1_1 = new JButton("3");
		btnNewButton_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3_1_1_1_1.setBounds(638, 267, 50, 50);
		contentPane.add(btnNewButton_3_1_1_1_1);
	}
}