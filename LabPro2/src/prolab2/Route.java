package prolab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Route {
	
    public static Map<String, Integer> distanceRoad = new HashMap<>();
    public static Map<String, Integer> distanceRail = new HashMap<>();
    public static Map<String, Integer> distanceAir = new HashMap<>();

	private ArrayList<String> travel = new ArrayList<String>();
	public ArrayList<Route> allRoute = new ArrayList<Route>();
	public static int routeCount = 0;
		
	public Route(ArrayList<String> travel) {
		this.travel = travel;
		allRoute.add(routeCount, this);
		routeCount++;
	}

	public String getTravel(int x) {
		return travel.get(x);
	}
	public void setTravel(String deger) {
		travel.add(deger);
	}

	public Route getAllRoute(int x) { 
		if(x < routeCount)
			 return allRoute.get(x); 
		else 
			return null;
	}
	

	public static void main(String[] args) {
//		 Seferin kalkıs, varıs noktalarını ve sefere ait mesafe bilgilerini içermeli
		distanceRoad.put("Istanbul-Kocaeli", 100);
		distanceRoad.put("Istanbul-Eskisehir", 300);
		distanceRoad.put("Istanbul-Ankara", 500);
		distanceRoad.put("Istanbul-Konya", 600);
		
		distanceRail.put("Istanbul-Kocaeli", 75);
		distanceRail.put("Istanbul-Bilecik", 225);
		distanceRail.put("Istanbul-Eskisehir", 300);
		distanceRail.put("Istanbul-Ankara", 375);
		distanceRail.put("Istanbul-Konya", 450);
		distanceRail.put("Kocaeli-Bilecik", 75);
		distanceRail.put("Kocaeli-Eskisehir", 150);
		distanceRail.put("Kocaeli-Ankara", 300);
		distanceRail.put("Kocaeli-Konya", 350);
		distanceRail.put("Bilecik-Eskisehir", 75);
		distanceRail.put("Bilecik-Ankara", 225);
		distanceRail.put("Bilecik-Konya", 300);
		distanceRail.put("Eskisehir-Ankara", 150);
		distanceRail.put("Eskisehir-Konya", 225);
		
		distanceAir.put("Istanbul-Ankara", 250);
		distanceAir.put("Istanbul-Konya", 250);

		


	}

}
