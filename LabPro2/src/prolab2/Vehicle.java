package prolab2;

abstract public class Vehicle {
	
	private Company companyName;
	private String vehicleId;
	private int vehicleCapacity;
	private int vehicleTravelNo;

	public Vehicle(Company companyName, String vehicleId, int vehicleCapacity, int vehicleTravelNo) {
		this.companyName = companyName;
		this.vehicleId = vehicleId;
		this.vehicleCapacity = vehicleCapacity;
		this.vehicleTravelNo = vehicleTravelNo;
	}

	public Company getCompanyName() {
		return companyName;
	}
	public void setCompanyName(Company companyName) {
		this.companyName = companyName;
	}

	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getVehicleCapacity() {
		return vehicleCapacity;
	}
	public void setVehicleCapacity(int vehicleCapacity) {
		this.vehicleCapacity = vehicleCapacity;
	}

	public int getVehicleTravelNo() {
		return vehicleTravelNo;
	}
	public void setVehicleTravelNo(int vehicleTravelNo) {
		this.vehicleTravelNo = vehicleTravelNo;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
