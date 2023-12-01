package prolab2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import view.LoginFrame;

public class Master {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bus("A", "oto1", 20, LocalDateTime.of(2023, 12, 4, 00, 00), 3, "Benzin", 5000, 2000, 10);
		new Bus("A", "oto2", 15, LocalDateTime.of(2023, 12, 4, 01, 00), 3, "Benzin", 5000, 2000, 10);
		
		new Bus("B", "oto3", 15, LocalDateTime.of(2023, 12, 4, 02, 00), 3, "Motorin", 3000, 1500, 5);
		new Bus("B", "oto4", 20, LocalDateTime.of(2023, 12, 4, 03, 00), 4, "Motorin", 3000, 1500, 5);
		
		new Bus("C", "oto5", 20, LocalDateTime.of(2023, 12, 4, 00, 30), 4, "Motorin", 4000, 2000, 6);
		new Airplane("C", "pln1", 30, LocalDateTime.of(2023, 12, 4, 01, 30), 5, "Gaz", 10000, 6000, 25);
		new Airplane("C", "pln2", 30, LocalDateTime.of(2023, 12, 4, 02, 30), 5, "Gaz", 10000, 6000, 25);
		
		new Train("D", "trn1", 25, LocalDateTime.of(2023, 12, 4, 03, 00), 1, "Elektrik", 2000, 1000, 3);
		new Train("D", "trn2", 25, LocalDateTime.of(2023, 12, 4, 03, 30), 2, "Elektrik", 2000, 1000, 3);
		new Train("D", "trn3", 25, LocalDateTime.of(2023, 12, 4, 04, 00), 2, "Elektrik",2000, 1000, 3);
		
		new Airplane("F", "pln3", 30, LocalDateTime.of(2023, 12, 4, 03, 00), 6, "Elektrik", 7500, 4000, 20);
		new Airplane("F", "pln4", 30, LocalDateTime.of(2023, 12, 4, 04, 00), 6, "Elektrik", 7500, 4000, 20);
		
		
		Admin.main(null);
		Trip.main(null);
		LoginFrame loginFrame=new LoginFrame();
		loginFrame.execute(0);
		
	}
}
