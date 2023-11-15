package prolab2;

import java.sql.Time;
import java.util.ArrayList;

//Her seferin bir aracı, guzergahı, zamanı, fiyatı gibi bilgiler bulunmalıdır

public class Trip {
		
		private Time departureTime;
		private int price;
		private static ArrayList<String> allRoute = new ArrayList<>();

	    
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


		public static ArrayList<String> getAllRoute() {
			return allRoute;
		}


		public static void setAllRoute(ArrayList<String> allRoute) {
			Trip.allRoute = allRoute;
		}


		public static void main(String[] args) {
	    	
			allRoute.add("Istanbul");
		    allRoute.add("Kocaeli");
		    allRoute.add("Bilecik");
		    allRoute.add("Eskisehir");
		    allRoute.add("Ankara");
		    allRoute.add("Konya");	
	}

}
