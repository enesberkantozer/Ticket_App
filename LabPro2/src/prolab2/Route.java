package prolab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Route {
	
    public static Map<String, Integer> distanceRoad = new HashMap<>();
    public static Map<String, Integer> distanceRail = new HashMap<>();
    public static Map<String, Integer> distanceAir = new HashMap<>();

	private ArrayList<String> travel = new ArrayList<String>();
    public static Map<Integer, ArrayList<String>> travelNo = new HashMap<>();
	public static int routeCount = 0;
		
	public Route(int index, ArrayList<String> travel) {
		this.travel = travel;
		travelNo.put(index, travel);
		routeCount++;
	}

	public String getTravel(int x) {
		return travel.get(x);
	}
	public void setTravel(String deger) {
		travel.add(deger);
	}

	public static void main(String[] args) {
//		 Seferin kalkıs, varıs noktalarını ve sefere ait mesafe bilgilerini içermeli
		distanceRoad.put("İstanbul-Kocaeli", 100);
		distanceRoad.put("İstanbul-Eskişehir", 300);
		distanceRoad.put("İstanbul-Ankara", 500);
		distanceRoad.put("İstanbul-Konya", 600);
		distanceRoad.put("Kocaeli-Ankara", 400);
		distanceRoad.put("Kocaeli-Eskişehir", 200);
		distanceRoad.put("Kocaeli-Konya", 500);
		distanceRoad.put("Eskişehir-Konya", 300);

		
		distanceRail.put("İstanbul-Kocaeli", 75);
		distanceRail.put("İstanbul-Bilecik", 225);
		distanceRail.put("İstanbul-Eskişehir", 300);
		distanceRail.put("İstanbul-Ankara", 375);
		distanceRail.put("İstanbul-Konya", 450);
		distanceRail.put("Kocaeli-Bilecik", 75);
		distanceRail.put("Kocaeli-Eskişehir", 150);
		distanceRail.put("Kocaeli-Ankara", 300);
		distanceRail.put("Kocaeli-Konya", 350);
		distanceRail.put("Bilecik-Eskişehir", 75);
		distanceRail.put("Bilecik-Ankara", 225);
		distanceRail.put("Bilecik-Konya", 300);
		distanceRail.put("Eskişehir-Ankara", 150);
		distanceRail.put("Eskişehir-Konya", 225);
		
		distanceAir.put("İstanbul-Ankara", 250);
		distanceAir.put("İstanbul-Konya", 250);
		
	}
}
