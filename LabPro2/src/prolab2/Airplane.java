package prolab2;

import java.time.LocalDateTime;

public class Airplane extends Vehicle{
	
//	public static int airplaneCount=0;
//	public static ArrayList<Airplane> airplanes = new ArrayList<Airplane>();

	public Airplane(String companyName, String vehicleId, int vehicleCapacity, LocalDateTime beginTime, int vehicleTravelNo, String typefuel,
			int costDriver, int costService, int priceFuel) {
		super(companyName, vehicleId, vehicleCapacity, beginTime, vehicleTravelNo, typefuel, costDriver, costService, priceFuel);
		
		Vehicle.vehiclesList.add(this);
		
//		airplanes.add(this);
//		airplaneCount++;
	}
	
	public static void main(String[] args) {

// 		metotlar vehicle'dan override edilecek
	}

}
