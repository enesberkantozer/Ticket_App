package prolab2;

import java.util.ArrayList;

public class Airplane extends Vehicle{
	
	public static int airplaneCount=0;
	public static ArrayList<Airplane> airplanes = new ArrayList<Airplane>();

	public Airplane(String companyName, String vehicleId, int vehicleCapacity, int vehicleTravelNo, String typefuel,
			int costDriver, int costService, int priceFuel) {
		super(companyName, vehicleId, vehicleCapacity, vehicleTravelNo, typefuel, costDriver, costService, priceFuel);
		airplanes.add(this);
		airplaneCount++;
	}
	
	public static void main(String[] args) {

// 		metotlar vehicle'dan override edilecek
	}

}
