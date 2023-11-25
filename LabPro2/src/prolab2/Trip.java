package prolab2;

import java.sql.Time;
//Her seferin bir aracı, guzergahı, zamanı, fiyatı gibi bilgiler bulunmalıdır

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
	    	
	}

}
