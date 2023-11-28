package prolab2;

import java.util.ArrayList;

public class Train extends Vehicle{
	
	public static int trainCount=0;
	public static ArrayList<Train> trains = new ArrayList<Train>();

	public Train(String companyName, String vehicleId, int vehicleCapacity, int vehicleTravelNo, int costDriver, int costService, int priceFuel) {
		super(companyName, vehicleId, vehicleCapacity, vehicleTravelNo, costDriver, costService, priceFuel);
		trains.add(this);
		trainCount++;
	}

	public static void main(String[] args) {

// 		metotlar vehicle'dan override edilecek
	}

}
