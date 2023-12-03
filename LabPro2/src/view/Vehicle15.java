package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class Vehicle15 extends VehicleTemplate{
	/**
	 * Create the frame.
	 */
	public Vehicle15() {
		super();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn15 = new JButton("15");
		btn15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15.setBounds(200, 75, 50, 50);
		contentPane.add(btn15);
		
		JButton btn12 = new JButton("12");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn12.setBounds(260, 75, 50, 50);
		contentPane.add(btn12);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn9.setBounds(320, 75, 50, 50);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn6.setBounds(380, 75, 50, 50);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3.setBounds(440, 75, 50, 50);
		contentPane.add(btn3);
		
		JButton btn14 = new JButton("14");
		btn14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn14.setBounds(200, 146, 50, 50);
		contentPane.add(btn14);
		
		JButton btn11 = new JButton("11");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn11.setBounds(260, 146, 50, 50);
		contentPane.add(btn11);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn8.setBounds(320, 146, 50, 50);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5.setBounds(380, 146, 50, 50);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBounds(440, 146, 50, 50);
		contentPane.add(btn2);
		
		JButton btn13 = new JButton("13");
		btn13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn13.setBounds(200, 282, 50, 50);
		contentPane.add(btn13);
		
		JButton btn10 = new JButton("10");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn10.setBounds(260, 282, 50, 50);
		contentPane.add(btn10);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn7.setBounds(320, 282, 50, 50);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4.setBounds(380, 282, 50, 50);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setBounds(440, 282, 50, 50);
		contentPane.add(btn1);
		
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
	}

}
