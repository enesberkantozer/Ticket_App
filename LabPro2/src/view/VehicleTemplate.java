package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VehicleTemplate {
	
	public ArrayList<JButton> buttons=new ArrayList<JButton>();
	public JFrame frame=new JFrame();
	
	public VehicleTemplate() {
		frame.setTitle("Koltuk Seç");
	}
	
	public void addPurchasedSeat(int selectedSeat) {
		for (int i = 0; i < buttons.size(); i++) {
			if(buttons.get(i).getText().equals(String.valueOf(selectedSeat))) {
				buttons.get(i).setEnabled(false);
			}
		}
	}
	
	public void execute(TravelSearchFrame returnFrame) {
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				returnFrame.execute();
			}
			
		});
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					AddPassengerDialog.main(null);
				}
			});
		}
	}
	
	public void execute() {
		frame.setVisible(true);
	}

}
