package prolab2;

//Her seferin bir aracı, guzergahı, zamanı, fiyatı gibi bilgiler bulunmalıdır
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trip {
		
    public static Map<String, Integer> ticketBus = new HashMap<>();
    public static Map<String, Integer> ticketTrain = new HashMap<>();
    public static Map<String, Integer> ticketAirplane = new HashMap<>();


	
		public static void main(String[] args) {
				    	
			new Route(new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Ankara")));
		    new Route(new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Konya")));
		    new Route(new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Ankara")));
		    new Route(new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Eskisehir", "Konya")));
		    new Route(new ArrayList<String>(List.of("Havayolu", "Istanbul", "Konya")));
		    new Route(new ArrayList<String>(List.of("Havayolu", "Istanbul", "Ankara")));
		    
		    ticketBus.put("İstanbul-Kocaeli", 50);
		    ticketBus.put("İstanbul-Eskisehir", 150);
		    ticketBus.put("İstanbul-Ankara", 300);
		    ticketBus.put("İstanbul-Konya", 300);
		    ticketBus.put("Kocaeli-Eskisehir", 100);
		    ticketBus.put("Kocaeli-Ankara", 400);
		    ticketBus.put("Kocaeli-Konya", 250);
		    ticketBus.put("Eskisehir-Konya", 150);
		    
		    ticketTrain.put("Istanbul-Kocaeli", 50);
		    ticketTrain.put("Istanbul-Bilecik", 150);
		    ticketTrain.put("Istanbul-Eskisehir", 200);
		    ticketTrain.put("Istanbul-Ankara", 250);
		    ticketTrain.put("Istanbul-Konya", 300);
		    ticketTrain.put("Kocaeli-Bilecik", 50);
		    ticketTrain.put("Kocaeli-Eskisehir", 100);
		    ticketTrain.put("Kocaeli-Ankara", 200);
		    ticketTrain.put("Kocaeli-Konya", 250);
		    ticketTrain.put("Bilecik-Eskisehir", 50);
		    ticketTrain.put("Bilecik-Ankara", 150);
		    ticketTrain.put("Bilecik-Konya", 200);
		    ticketTrain.put("Eskisehir-Ankara", 100);
		    ticketTrain.put("Eskisehir-Konya", 150);
		    
		    ticketAirplane.put("Istanbul-Ankara", 1000);
		    ticketAirplane.put("Istanbul-Konya", 1200);



		    


	}
}
