package prolab2;

import java.time.LocalDateTime;

public class Train extends Vehicle{

	public Train(String companyName, String vehicleId, int vehicleCapacity, LocalDateTime beginTime, int vehicleTravelNo, String typefuel,
			int costDriver, int costService, int priceFuel) {
		super(companyName, vehicleId, vehicleCapacity, beginTime, vehicleTravelNo, typefuel, costDriver, costService, priceFuel);
		
		Vehicle.vehiclesList.add(this);
	}
}
