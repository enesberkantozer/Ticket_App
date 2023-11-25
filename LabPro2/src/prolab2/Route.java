package prolab2;

import java.util.ArrayList;
import java.util.List;
public class Route {
	
	private ArrayList<String> travel = new ArrayList<String>();
	public static ArrayList<ArrayList<String>> allRoute = new ArrayList<ArrayList<String>>(); 
	
	public Route(ArrayList<String> travel) {
		this.travel = travel;
		allRoute.add(travel);
	}

	public String getTravel(int x) {
		return travel.get(x);
	}
	public void setTravel(String deger) {
		travel.add(deger);
	}

	public String getAllRoute(int x, int y) {
		 if (x >= 0 && x < allRoute.size() && y >= 0) {
		        ArrayList<String> row = allRoute.get(x);

		        // y koordinatının satırın sınırları içinde olup olmadığını kontrol et
		        if (y < row.size()) {
		            // Belirtilen koordinatlardaki elemanı al
		            String element = row.get(y);
		            return element;
		        } 
		        else 
		            // y, satırın sınırlarının dışında ise işle
		            return "Geçersiz y koordinatı";
		 } 
		 else 
		        // x, ArrayList'in sınırlarının dışında ise işle
		        return "Geçersiz x koordinatı";
		    
	}
	public ArrayList<String> getAllRoute(int x) {
		 if (x >= 0 && x < allRoute.size()) {
			 return allRoute.get(x);
		 } 
		 else 
		        // x, ArrayList'in sınırlarının dışında ise işle
		        return new ArrayList<String>(List.of("Geçersiz x koordinatı"));
		    
	}
	

	public static void main(String[] args) {
//		 Seferin kalkıs, varıs noktalarını ve sefere ait mesafe bilgilerini içermeli
	}

}
