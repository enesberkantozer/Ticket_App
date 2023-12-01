package prolab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Route {
	
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
				
	}
}
