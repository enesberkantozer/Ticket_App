package prolab2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import view.Vehicle15;
import view.Vehicle20;
import view.Vehicle25;
import view.Vehicle30;
import view.VehicleTemplate;

abstract public class Vehicle {
	
	private String companyName;
	private String vehicleId;
	private int vehicleCapacity;
	private LocalDateTime beginTime;
	private int vehicleTravelNo;
	private String typeFuel;
	private int costDriver;
	private int costService;
	private int priceFuel;
	private ArrayList<Integer> purchasedSeat=new ArrayList<Integer>();
	
	
	public static int vehicleCount=0;
	public static ArrayList<Vehicle> vehiclesList=new ArrayList<Vehicle>();
	
	public VehicleTemplate arac;

	public Vehicle(String companyName, String vehicleId, int vehicleCapacity, LocalDateTime beginTime, int vehicleTravelNo, String typuFuel,
			int costDriver, int costService, int priceFuel) {
		
		new Personel(companyName, vehicleId, "", "", true);
		new Personel(companyName, vehicleId, "", "", true);
		new Personel(companyName, vehicleId, "", "", false);
		new Personel(companyName, vehicleId, "", "", false);
		
		this.companyName = companyName;
		this.vehicleId = vehicleId;
		this.vehicleCapacity = vehicleCapacity;
		this.beginTime=beginTime;
		this.vehicleTravelNo = vehicleTravelNo;
		this.typeFuel = typuFuel;
		this.costDriver = costDriver;
		this.costService = costService;
		this.priceFuel = priceFuel;
		vehicleCount++;
		
		if(vehicleCapacity==15) {
			arac=new Vehicle15();
		}
		else if(vehicleCapacity==20) {
			arac=new Vehicle20();
		}
		else if(vehicleCapacity==25) {
			arac=new Vehicle25();
		}
		else if(vehicleCapacity==30) {
			arac=new Vehicle30();
		}
		
		randomSeat();
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

	public LocalDateTime getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(LocalDateTime beginTime) {
		this.beginTime = beginTime;
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
	
	public int getPurchasedSeatSize() {
		return purchasedSeat.size();
	}

	public void addPurchasedSeat(int selectedSeat) {
		purchasedSeat.add(selectedSeat);
		arac.addPurchasedSeat(selectedSeat);
	}

	private void randomSeat() {
		Random rdn=new Random();
		
		int rdnFor;
		do {
			rdnFor=rdn.nextInt(vehicleCapacity);
		}while(rdnFor<5);
		
		for (int i = 0; i < rdnFor; i++) {
			int rdnSeat=rdn.nextInt(vehicleCapacity);
			
			if(purchasedSeat.contains(rdnSeat)==false) {
				purchasedSeat.add(rdnSeat);
				arac.addPurchasedSeat(rdnSeat);
			}
			else {
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
