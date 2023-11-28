package prolab2;

import java.sql.Time;
//Her seferin bir aracı, guzergahı, zamanı, fiyatı gibi bilgiler bulunmalıdır
import java.util.ArrayList;
import java.util.List;

public class Trip {
		
		private Time departureTime;
		private int price;

	    
	    public Trip(Time departureTime, int price) {
			this.departureTime = departureTime;
			this.price = price;
		}

	    public Time getDepartureTime() {
			return departureTime;
		}
		public void setDepartureTime(Time departureTime) {
			this.departureTime = departureTime;
		}

		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}

		public static void main(String[] args) {
	    	
			 new Route(new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Ankara")));
		     new Route(new ArrayList<String>(List.of("Demiryolu", "Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Konya")));
		     new Route(new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Ankara")));
		     new Route(new ArrayList<String>(List.of("Karayolu", "Istanbul", "Kocaeli", "Eskisehir", "Konya")));
		     new Route(new ArrayList<String>(List.of("Havayolu", "Istanbul", "Konya")));
		     new Route(new ArrayList<String>(List.of("Havayolu", "Istanbul", "Ankara")));
	}
}
