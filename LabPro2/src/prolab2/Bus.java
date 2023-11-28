package prolab2;

import java.util.ArrayList;

public class Bus extends Vehicle{
//		metotlar vehicle'dan override edilecek

	public static int busCount=0;
	public static ArrayList<Bus> buses = new ArrayList<Bus>();

	public Bus(String companyName, String vehicleId, int vehicleCapacity, int vehicleTravelNo, int costDriver, int costService, int priceFuel) {
		super(companyName, vehicleId, vehicleCapacity, vehicleTravelNo, costDriver, costService, priceFuel);
		buses.add(this);
		busCount++;
	}
	public static void main(String[] args) {
		
	}
}
