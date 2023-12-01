package prolab2;

import java.time.LocalDateTime;
//Her seferin bir aracı, guzergahı, zamanı, fiyatı gibi bilgiler bulunmalıdır
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trip {
		
    public static Map<String, Integer[]> timeBus = new HashMap<>();
    public static Map<String, Integer[]> timeTrain = new HashMap<>();
    public static Map<String, Integer[]> timeAirplane = new HashMap<>();
    
    public static Map<String, LocalDateTime> timeBus = new HashMap<>();
    public static Map<String, LocalDateTime> timeTrain = new HashMap<>();
    public static Map<String, LocalDateTime> timeAirplane = new HashMap<>();


	
		public static void main(String[] args) {
				    	
			new Route(1, new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Ankara")));
		    new Route(2, new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Konya")));
		    new Route(3, new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Ankara")));
		    new Route(4, new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Eskisehir", "Konya")));
		    new Route(5, new ArrayList<String>(List.of("Havayolu", "Istanbul", "Konya")));
		    new Route(6, new ArrayList<String>(List.of("Havayolu", "Istanbul", "Ankara")));
		    	    
		    
		    timeBus.put("İstanbul-Kocaeli", new Integer[] {50, 100}); //km, fiyat, saat
		    timeBus.put("İstanbul-Eskişehir", new Integer[] {150, 300});
		    timeBus.put("İstanbul-Ankara", new Integer[] {300, 500});
		    timeBus.put("İstanbul-Konya", new Integer[] {300, 600});
		    timeBus.put("Kocaeli-Eskişehir", new Integer[] {100, 200});
		    timeBus.put("Kocaeli-Ankara", new Integer[] {400, 400});
		    timeBus.put("Kocaeli-Konya", new Integer[] {250, 500});
		    timeBus.put("Eskişehir-Konya", new Integer[] {150, 300});

		    timeBus.put("Kocaeli-İstanbul", new Integer[] {50, 100});
		    timeBus.put("Eskişehir-İstanbul", new Integer[] {150, 300});
		    timeBus.put("Ankara-İstanbul", new Integer[] {300, 500});
		    timeBus.put("Konya-İstanbul", new Integer[] {300, 600});
		    timeBus.put("Eskişehir-Kocaeli", new Integer[] {100, 200});
		    timeBus.put("Ankara-Kocaeli", new Integer[] {400, 400});
		    timeBus.put("Konya-Kocaeli", new Integer[] {250, 500});
		    timeBus.put("Konya-Eskişehir", new Integer[] {150, 300} );

		    
		    timeTrain.put("İstanbul-Kocaeli", new Integer[] {50 ,75});
		    timeTrain.put("İstanbul-Bilecik", new Integer[] {150, 225});
		    timeTrain.put("İstanbul-Eskişehir", new Integer[] {200, 300});
		    timeTrain.put("İstanbul-Ankara", new Integer[] {250, 375});
		    timeTrain.put("İstanbul-Konya", new Integer[] {300, 450});
		    timeTrain.put("Kocaeli-Bilecik", new Integer[] {50, 75});
		    timeTrain.put("Kocaeli-Eskişehir", new Integer[] {100, 150});
		    timeTrain.put("Kocaeli-Ankara", new Integer[] {200, 300});
		    timeTrain.put("Kocaeli-Konya", new Integer[] {250, 350});
		    timeTrain.put("Bilecik-Eskişehir", new Integer[] {50, 75});
		    timeTrain.put("Bilecik-Ankara", new Integer[] {150, 225});
		    timeTrain.put("Bilecik-Konya", new Integer[] {200, 300});
		    timeTrain.put("Eskişehir-Ankara", new Integer[] {100, 150});
		    timeTrain.put("Eskişehir-Konya", new Integer[] {150, 225});
		    
		    timeTrain.put("Kocaeli-İstanbul", new Integer[] {50, 75});
		    timeTrain.put("Bilecik-İstanbul", new Integer[] {150, 225});
		    timeTrain.put("Eskişehir-İstanbul", new Integer[] {200, 300});
		    timeTrain.put("Ankara-İstanbul", new Integer[] {250, 375});
		    timeTrain.put("Konya-İstanbul", new Integer[] {300, 450});
		    timeTrain.put("Bilecik-Kocaeli", new Integer[] {50, 75});
		    timeTrain.put("Eskişehir-Kocaeli", new Integer[] {100, 150});
		    timeTrain.put("Ankara-Kocaeli", new Integer[] {200, 300});
		    timeTrain.put("Konya-Kocaeli", new Integer[] {250, 350});
		    timeTrain.put("Eskişehir-Bilecik", new Integer[] {50, 75});
		    timeTrain.put("Ankara-Bilecik", new Integer[] {150, 225});
		    timeTrain.put("Konya-Bilecik", new Integer[] {200, 300});
		    timeTrain.put("Ankara-Eskişehir", new Integer[] {100, 150});
		    timeTrain.put("Konya-Eskişehir", new Integer[] {150, 225});
		    
		    
		    timeAirplane.put("İstanbul-Ankara", new Integer[] {1000, 250});
		    timeAirplane.put("İstanbul-Konya", new Integer[] {1200, 250});
		    
		    timeAirplane.put("Ankara-İstanbul", new Integer[] {1000, 250});
		    timeAirplane.put("Konya-İstanbul", new Integer[] {1200, 250});
		    
		    timeBus.put("İstanbul-Kocaeli", ); //saat
		    timeBus.put("İstanbul-Eskişehir", );
		    timeBus.put("İstanbul-Ankara", );
		    timeBus.put("İstanbul-Konya", );
		    timeBus.put("Kocaeli-Eskişehir", );
		    timeBus.put("Kocaeli-Ankara", );
		    timeBus.put("Kocaeli-Konya", );
		    timeBus.put("Eskişehir-Konya", );

		    timeBus.put("Kocaeli-İstanbul", );
		    timeBus.put("Eskişehir-İstanbul", );
		    timeBus.put("Ankara-İstanbul", );
		    timeBus.put("Konya-İstanbul", );
		    timeBus.put("Eskişehir-Kocaeli", );
		    timeBus.put("Ankara-Kocaeli", );
		    timeBus.put("Konya-Kocaeli", );
		    timeBus.put("Konya-Eskişehir",  );
		    
		    timeTrain.put("İstanbul-Kocaeli", );
		    timeTrain.put("İstanbul-Bilecik", );
		    timeTrain.put("İstanbul-Eskişehir", );
		    timeTrain.put("İstanbul-Ankara", );
		    timeTrain.put("İstanbul-Konya",);
		    timeTrain.put("Kocaeli-Bilecik", );
		    timeTrain.put("Kocaeli-Eskişehir", );
		    timeTrain.put("Kocaeli-Ankara", );
		    timeTrain.put("Kocaeli-Konya", );
		    timeTrain.put("Bilecik-Eskişehir", );
		    timeTrain.put("Bilecik-Ankara", );
		    timeTrain.put("Bilecik-Konya", );
		    timeTrain.put("Eskişehir-Ankara", );
		    timeTrain.put("Eskişehir-Konya", );
		    
		    timeTrain.put("Kocaeli-İstanbul",);
		    timeTrain.put("Bilecik-İstanbul", );
		    timeTrain.put("Eskişehir-İstanbul", );
		    timeTrain.put("Ankara-İstanbul", );
		    timeTrain.put("Konya-İstanbul", );
		    timeTrain.put("Bilecik-Kocaeli",);
		    timeTrain.put("Eskişehir-Kocaeli", );
		    timeTrain.put("Ankara-Kocaeli", );
		    timeTrain.put("Konya-Kocaeli", );
		    timeTrain.put("Eskişehir-Bilecik",);
		    timeTrain.put("Ankara-Bilecik", );
		    timeTrain.put("Konya-Bilecik", );
		    timeTrain.put("Ankara-Eskişehir",);
		    timeTrain.put("Konya-Eskişehir", );
		    
		    timeAirplane.put("İstanbul-Ankara",);
		    timeAirplane.put("İstanbul-Konya", );
		    
		    timeAirplane.put("Ankara-İstanbul",);
		    timeAirplane.put("Konya-İstanbul", );

	}
}
