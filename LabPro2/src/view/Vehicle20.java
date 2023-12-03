package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Vehicle20 extends VehicleTemplate {
	/**
	 * Create the frame.
	 */
	public Vehicle20() {
		super();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn19 = new JButton("19");
		btn19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn19.setBounds(200, 124, 50, 50);
		contentPane.add(btn19);
		
		JButton btn15 = new JButton("15");
		btn15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15.setBounds(260, 124, 50, 50);
		contentPane.add(btn15);
		
		JButton btn11 = new JButton("11");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn11.setBounds(320, 124, 50, 50);
		contentPane.add(btn11);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn7.setBounds(380, 124, 50, 50);
		contentPane.add(btn7);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3.setBounds(440, 124, 50, 50);
		contentPane.add(btn3);
		
		JButton btn18 = new JButton("18");
		btn18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn18.setBounds(200, 266, 50, 50);
		contentPane.add(btn18);
		
		JButton btn14 = new JButton("14");
		btn14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn14.setBounds(260, 266, 50, 50);
		contentPane.add(btn14);
		
		JButton btn10 = new JButton("10");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn10.setBounds(320, 266, 50, 50);
		contentPane.add(btn10);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn6.setBounds(380, 266, 50, 50);
		contentPane.add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBounds(440, 266, 50, 50);
		contentPane.add(btn2);
		
		JButton btn17 = new JButton("17");
		btn17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn17.setBounds(200, 342, 50, 50);
		contentPane.add(btn17);
		
		JButton btn13 = new JButton("13");
		btn13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn13.setBounds(260, 342, 50, 50);
		contentPane.add(btn13);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn9.setBounds(320, 342, 50, 50);
		contentPane.add(btn9);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5.setBounds(380, 342, 50, 50);
		contentPane.add(btn5);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setBounds(440, 342, 50, 50);
		contentPane.add(btn1);
		
		JButton btn20 = new JButton("20");
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn20.setBounds(200, 50, 50, 50);
		contentPane.add(btn20);
		
		JButton btn16 = new JButton("16");
		btn16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn16.setBounds(260, 50, 50, 50);
		contentPane.add(btn16);
		
		JButton btn12 = new JButton("12");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn12.setBounds(320, 50, 50, 50);
		contentPane.add(btn12);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn8.setBounds(380, 50, 50, 50);
		contentPane.add(btn8);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4.setBounds(440, 50, 50, 50);
		contentPane.add(btn4);
		
		super.buttons.add(btn1);
		super.buttons.add(btn2);
		super.buttons.add(btn3);
		super.buttons.add(btn4);
		super.buttons.add(btn5);
		super.buttons.add(btn6);
		super.buttons.add(btn7);
		super.buttons.add(btn8);
		super.buttons.add(btn9);
		super.buttons.add(btn10);
		super.buttons.add(btn11);
		super.buttons.add(btn12);
		super.buttons.add(btn13);
		super.buttons.add(btn14);
		super.buttons.add(btn15);
		super.buttons.add(btn16);
		super.buttons.add(btn17);
		super.buttons.add(btn18);
		super.buttons.add(btn19);
		super.buttons.add(btn20);
	}
	
}