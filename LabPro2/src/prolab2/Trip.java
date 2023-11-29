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
				    	
			new Route(1, new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Ankara")));
		    new Route(2, new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Konya")));
		    new Route(3, new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Ankara")));
		    new Route(4, new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Eskisehir", "Konya")));
		    new Route(5, new ArrayList<String>(List.of("Havayolu", "Istanbul", "Konya")));
		    new Route(6, new ArrayList<String>(List.of("Havayolu", "Istanbul", "Ankara")));
		    
		    ticketBus.put("İstanbul-Kocaeli", 50);
		    ticketBus.put("İstanbul-Eskişehir", 150);
		    ticketBus.put("İstanbul-Ankara", 300);
		    ticketBus.put("İstanbul-Konya", 300);
		    ticketBus.put("Kocaeli-Eskişehir", 100);
		    ticketBus.put("Kocaeli-Ankara", 400);
		    ticketBus.put("Kocaeli-Konya", 250);
		    ticketBus.put("Eskişehir-Konya", 150);
		    
		    ticketTrain.put("İstanbul-Kocaeli", 50);
		    ticketTrain.put("İstanbul-Bilecik", 150);
		    ticketTrain.put("İstanbul-Eskişehir", 200);
		    ticketTrain.put("İstanbul-Ankara", 250);
		    ticketTrain.put("İstanbul-Konya", 300);
		    ticketTrain.put("Kocaeli-Bilecik", 50);
		    ticketTrain.put("Kocaeli-Eskişehir", 100);
		    ticketTrain.put("Kocaeli-Ankara", 200);
		    ticketTrain.put("Kocaeli-Konya", 250);
		    ticketTrain.put("Bilecik-Eskişehir", 50);
		    ticketTrain.put("Bilecik-Ankara", 150);
		    ticketTrain.put("Bilecik-Konya", 200);
		    ticketTrain.put("Eskişehir-Ankara", 100);
		    ticketTrain.put("Eskişehir-Konya", 150);
		    
		    ticketAirplane.put("İstanbul-Ankara", 1000);
		    ticketAirplane.put("İstanbul-Konya", 1200);

	}
}
