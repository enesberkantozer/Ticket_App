package prolab2;

public class Bus extends Vehicle{
//		metotlar vehicle'dan override edilecek

//	public static int busCount=0;
//	public static ArrayList<Bus> buses = new ArrayList<Bus>();

	public Bus(String companyName, String vehicleId, int vehicleCapacity, int vehicleTravelNo, String typefuel,
			int costDriver, int costService, int priceFuel) {
		super(companyName, vehicleId, vehicleCapacity, vehicleTravelNo, typefuel, costDriver, costService, priceFuel);
		
		Vehicle.vehiclesList.add(this);
		
//		buses.add(this);
//		busCount++;
	}
	public static void main(String[] args) {
		
	}
}
