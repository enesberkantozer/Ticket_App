package prolab2;

import view.LoginFrame;

public class Master {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bus("A", "oto1", 40, 3, "Benzin", 5000, 2000, 10);
		new Bus("A", "oto2", 30, 3, "Benzin", 5000, 2000, 10);
		
		new Bus("B", "oto3", 30, 3, "Motorin", 3000, 1500, 5);
		new Bus("B", "oto4", 40, 4, "Motorin", 3000, 1500, 5);
		
		new Bus("C", "oto5", 40, 4, "Motorin", 4000, 2000, 6);
		new Airplane("C", "pln1", 60, 5, "Gaz", 10000, 6000, 25);
		new Airplane("C", "pln2", 60, 5, "Gaz", 10000, 6000, 25);
		
		new Train("D", "trn1", 50, 1, "Elektrik", 2000, 1000, 3);
		new Train("D", "trn2", 50, 2, "Elektrik", 2000, 1000, 3);
		new Train("D", "trn3", 50, 2, "Elektrik",2000, 1000, 3);
		
		new Airplane("F", "pln3", 60, 6, "Elektrik", 7500, 4000, 20);
		new Airplane("F", "pln4", 60, 6, "Elektrik", 7500, 4000, 20);
		
		
		
		Admin.main(null);
		Trip.main(null);
		LoginFrame loginFrame=new LoginFrame();
		loginFrame.execute(0);
		
	}
}
