package prolab2;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class Master {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Company A = new Company("A");
//		Company B = new Company("B");
//		Company C = new Company("C");
//		Company D = new Company("D");
//		Company F = new Company("F");
		
				
        Route travel1 = new Route(new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Ankara")));
        Route travel2 = new Route(new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Konya")));
        Route travel3 = new Route(new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Ankara")));
        Route travel4 = new Route(new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Eskisehir", "Konya")));
        Route travel5 = new Route(new ArrayList<String>(List.of("Havayolu", "Istanbul", "Konya")));
        Route travel6 = new Route(new ArrayList<String>(List.of("Havayolu", "Istanbul", "Ankara")));
        
		System.out.println(travel1.getAllRoute(1, 0));
		System.out.println(travel1.getAllRoute(1));
		
		
		ArrayList<String> sirketler=new ArrayList<String>();
		
		
		
		Bus oto1 = new Bus("A", "oto1", 40, 3, 5000, 2000, 10);
		Bus oto2 = new Bus("A", "oto2", 30, 3, 5000, 2000, 10);
		
		Bus oto3 = new Bus("B", "oto3", 30, 3, 3000, 1500, 5);
		Bus oto4 = new Bus("B", "oto4", 40, 4, 3000, 1500, 5);
		
		Bus oto5 = new Bus("C", "oto5", 40, 4, 4000, 2000, 6);
		Airplane pln1 = new Airplane("C", "pln1", 60, 5, 10000, 6000, 25);
		Airplane pln2 = new Airplane("C", "pln2", 60, 5, 10000, 6000, 25);
		
		Train trn1 = new Train("D", "trn1", 50, 1, 2000, 1000, 3);
		Train trn2 = new Train("D", "trn2", 50, 2, 2000, 1000, 3);
		Train trn3 = new Train("D", "trn3", 50, 2, 2000, 1000, 3);
		
		Airplane pln3 = new Airplane("F", "pln3", 60, 6, 7500, 4000, 20);
		Airplane pln4 = new Airplane("F", "pln4", 60, 6, 7500, 4000, 20);

		Personel emre = new Personel("A", oto1, "emre", "algan", true);
		
		
	}
	
	
}
