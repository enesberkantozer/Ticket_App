package prolab2;

//Her seferin bir aracı, guzergahı, zamanı, fiyatı gibi bilgiler bulunmalıdır
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trip {
		
    public static Map<String, Integer[]> infoBus = new HashMap<>();
    public static Map<String, Integer[]> infoTrain = new HashMap<>();
    public static Map<String, Integer[]> infoAirplane = new HashMap<>();

	
		public static void main(String[] args) {
				    	
			new Route(1, new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Ankara")));
		    new Route(2, new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Konya")));
		    new Route(3, new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Ankara")));
		    new Route(4, new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Eskisehir", "Konya")));
		    new Route(5, new ArrayList<String>(List.of("Havayolu", "Istanbul", "Konya")));
		    new Route(6, new ArrayList<String>(List.of("Havayolu", "Istanbul", "Ankara")));
		    
		    
		    
		    infoBus.put("İstanbul-Kocaeli", new Integer[] {50, 100}); //km, fiyat, saat
		    infoBus.put("İstanbul-Eskişehir", new Integer[] {150, 300});
		    infoBus.put("İstanbul-Ankara", new Integer[] {300, 500});
		    infoBus.put("İstanbul-Konya", new Integer[] {300, 600});
		    infoBus.put("Kocaeli-Eskişehir", new Integer[] {100, 200});
		    infoBus.put("Kocaeli-Ankara", new Integer[] {400, 400});
		    infoBus.put("Kocaeli-Konya", new Integer[] {250, 500});
		    infoBus.put("Eskişehir-Konya", new Integer[] {150, 300});

		    infoBus.put("Kocaeli-İstanbul", new Integer[] {50, 100});
		    infoBus.put("Eskişehir-İstanbul", new Integer[] {150, 300});
		    infoBus.put("Ankara-İstanbul", new Integer[] {300, 500});
		    infoBus.put("Konya-İstanbul", new Integer[] {300, 600});
		    infoBus.put("Eskişehir-Kocaeli", new Integer[] {100, 200});
		    infoBus.put("Ankara-Kocaeli", new Integer[] {400, 400});
		    infoBus.put("Konya-Kocaeli", new Integer[] {250, 500});
		    infoBus.put("Konya-Eskişehir", new Integer[] {150, 300} );

		    
		    infoTrain.put("İstanbul-Kocaeli", new Integer[] {50 ,75});
		    infoTrain.put("İstanbul-Bilecik", new Integer[] {150, 225});
		    infoTrain.put("İstanbul-Eskişehir", new Integer[] {200, 300});
		    infoTrain.put("İstanbul-Ankara", new Integer[] {250, 375});
		    infoTrain.put("İstanbul-Konya", new Integer[] {300, 450});
		    infoTrain.put("Kocaeli-Bilecik", new Integer[] {50, 75});
		    infoTrain.put("Kocaeli-Eskişehir", new Integer[] {100, 150});
		    infoTrain.put("Kocaeli-Ankara", new Integer[] {200, 300});
		    infoTrain.put("Kocaeli-Konya", new Integer[] {250, 350});
		    infoTrain.put("Bilecik-Eskişehir", new Integer[] {50, 75});
		    infoTrain.put("Bilecik-Ankara", new Integer[] {150, 225});
		    infoTrain.put("Bilecik-Konya", new Integer[] {200, 300});
		    infoTrain.put("Eskişehir-Ankara", new Integer[] {100, 150});
		    infoTrain.put("Eskişehir-Konya", new Integer[] {150, 225});
		    
		    infoTrain.put("Kocaeli-İstanbul", new Integer[] {50, 75});
		    infoTrain.put("Bilecik-İstanbul", new Integer[] {150, 225});
		    infoTrain.put("Eskişehir-İstanbul", new Integer[] {200, 300});
		    infoTrain.put("Ankara-İstanbul", new Integer[] {250, 375});
		    infoTrain.put("Konya-İstanbul", new Integer[] {300, 450});
		    infoTrain.put("Bilecik-Kocaeli", new Integer[] {50, 75});
		    infoTrain.put("Eskişehir-Kocaeli", new Integer[] {100, 150});
		    infoTrain.put("Ankara-Kocaeli", new Integer[] {200, 300});
		    infoTrain.put("Konya-Kocaeli", new Integer[] {250, 350});
		    infoTrain.put("Eskişehir-Bilecik", new Integer[] {50, 75});
		    infoTrain.put("Ankara-Bilecik", new Integer[] {150, 225});
		    infoTrain.put("Konya-Bilecik", new Integer[] {200, 300});
		    infoTrain.put("Ankara-Eskişehir", new Integer[] {100, 150});
		    infoTrain.put("Konya-Eskişehir", new Integer[] {150, 225});
		    
		    
		    infoAirplane.put("İstanbul-Ankara", new Integer[] {1000, 250});
		    infoAirplane.put("İstanbul-Konya", new Integer[] {1200, 250});
		    
		    infoAirplane.put("Ankara-İstanbul", new Integer[] {1000, 250});
		    infoAirplane.put("Konya-İstanbul", new Integer[] {1200, 250});

	}
}
