package prolab2;

public class Train extends Vehicle{
	
//	public static int trainCount=0;
//	public static ArrayList<Train> trains = new ArrayList<Train>();

	public Train(String companyName, String vehicleId, int vehicleCapacity, int vehicleTravelNo, String typefuel,
			int costDriver, int costService, int priceFuel) {
		super(companyName, vehicleId, vehicleCapacity, vehicleTravelNo, typefuel, costDriver, costService, priceFuel);
		
		Vehicle.vehiclesList.add(this);
		
//		trains.add(this);
//		trainCount++;
	}

	public static void main(String[] args) {

// 		metotlar vehicle'dan override edilecek
	}

}
