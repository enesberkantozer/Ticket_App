package prolab2;

import java.util.ArrayList;
import java.util.List;

public class Master {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company A = new Company("A");
		Company B = new Company("B");
		Company C = new Company("C");
		Company D = new Company("D");
		Company F = new Company("F");
		
		Personel emre = new Personel(A, "emre", "algan");
		
        Route travel1 = new Route(new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Ankara")));
        Route travel2 = new Route(new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Konya")));
        Route travel3 = new Route(new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Ankara")));
        Route travel4 = new Route(new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Eskisehir", "Konya")));
        Route travel5 = new Route(new ArrayList<String>(List.of("Havayolu", "Istanbul", "Konya")));
        Route travel6 = new Route(new ArrayList<String>(List.of("Havayolu", "Istanbul", "Ankara")));
        
		System.out.println(travel1.getAllRoute(1, 0));
		System.out.println(travel1.getAllRoute(1));
		
		Bus oto1 = new Bus(A, "oto1", 40, 3);
		Bus oto2 = new Bus(A, "oto2", 30, 3);
		
		Bus oto3 = new Bus(B, "oto3", 30, 3);
		Bus oto4 = new Bus(B, "oto4", 40, 4);
		
		Bus oto5 = new Bus(C, "oto5", 40, 4);
		Airplane pln1 = new Airplane(C, "pln1", 60, 5);
		Airplane pln2 = new Airplane(C, "pln2", 60, 5);
		
		Train trn1 = new Train(D, "trn1", 50, 1);
		Train trn2 = new Train(D, "trn2", 50, 2);
		Train trn3 = new Train(D, "trn3", 50, 2);
		
		Airplane pln3 = new Airplane(F, "pln3", 60, 6);
		Airplane pln4 = new Airplane(F, "pln4", 60, 6);


	}
}
