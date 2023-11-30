package prolab2;

import java.time.LocalDateTime;
import java.util.ArrayList;

abstract public class Vehicle {
	
	private String companyName;
	private String vehicleId;
	private int vehicleCapacity;
	private int vehicleTravelNo;
	private String typeFuel;
	private int costDriver;
	private int costService;
	private int priceFuel;
	
	public static int vehicleCount=0;
	public static ArrayList<Vehicle> vehiclesList=new ArrayList<Vehicle>();

	public Vehicle(String companyName, String vehicleId, int vehicleCapacity, int vehicleTravelNo, String typuFuel,
			int costDriver, int costService, int priceFuel) {
		
		this.companyName = companyName;
		this.vehicleId = vehicleId;
		this.vehicleCapacity = vehicleCapacity;
		this.vehicleTravelNo = vehicleTravelNo;
		this.typeFuel = typuFuel;
		this.costDriver = costDriver;
		this.costService = costService;
		this.priceFuel = priceFuel;
		vehicleCount++;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
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
	
	public String getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}

	public int getCostDriver() {
		return costDriver;
	}
	public void setCostDriver(int costDriver) {
		this.costDriver = costDriver;
	}

	public int getCostService() {
		return costService;
	}
	public void setCostService(int costService) {
		this.costService = costService;
	}

	public int getPriceFuel() {
		return priceFuel;
	}
	public void setPriceFuel(int priceFuel) {
		this.priceFuel = priceFuel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
