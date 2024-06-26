package prolab2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Company extends User implements IProfitable {

	private String companyName;
	private String username;
	private String password;

	public int ciro = 0;

	public static int companyCount = 0;
	public static ArrayList<Company> companysList = new ArrayList<Company>();

	private ArrayList<String> sefer = new ArrayList<>();
	private ArrayList<String> arac = new ArrayList<>();

	public Company(String companyName, String username, String password) {
		super();
		this.companyName = companyName;
		this.username = username;
		this.password = password;
		companysList.add(this);
		companyCount++;
		Trip.main(null);
		profit(companyName);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSefer(int x) {
		return sefer.get(x);
	}

	public void setSefer(String deger) {
		sefer.add(deger);
	}

	public String getArac(int x) {
		return arac.get(x);
	}

	public void setArac(String deger) {
		arac.add(deger);
	}

	public void profit(String companyName) {

		int price = 1000;
		for (int i = 0; i < Vehicle.vehiclesList.size(); i++) {
			Vehicle v = Vehicle.vehiclesList.get(i);
			if (v.getCompanyName().equals(companyName)) {
				price += (v.getCostDriver() + v.getCostService()) * 4;
				int a = v.getVehicleTravelNo();
				Map<String, Integer[]> info = new HashMap<>();
				info = ((v instanceof Bus) ? Trip.infoBus
						: (v instanceof Train) ? Trip.infoTrain : Trip.infoAirplane);
				for (int j = 1; j < Route.travelNo.get(a).size() - 1; j++) {

					String city = Route.travelNo.get(a).get(j).toString() + "-"
							+ Route.travelNo.get(a).get(j + 1).toString();
					System.out.println("city: " + city);
					Integer dizi[] = info.get(city); // 0. indis fiyat 1. indis km
					System.out.println("km " + dizi[1]);
					price += (v.getPriceFuel() * dizi[1]);
				}
			}
		}
		ciro -= price;
	}

	public void addPsngrPrice(String[] dataPass) {
		int profitEarn=0;
		Map<String, Integer[]> info = new HashMap<>();
		info = dataPass[0].equals("Otobüs") ? Trip.infoBus
				: (dataPass[0].equals("Tren") ? Trip.infoTrain : Trip.infoAirplane);
		Integer[] dizi = info.get(dataPass[1] + "-" + dataPass[2]);
		profitEarn = dizi[0];
		ciro += profitEarn;
	}

	public void addPsngrPrice(int travelNo) {
		if(travelNo!=0) {
			int profitEarn=0;
			Map<String, Integer[]> info = new HashMap<>();
			String dataPass[] = new String[3];
			dataPass[0] = Route.travelNo.get(travelNo).get(0);
			dataPass[1] = Route.travelNo.get(travelNo).get(1);
			dataPass[2] = Route.travelNo.get(travelNo).get(Route.travelNo.get(travelNo).size() / 2);
			if (Route.travelNo.get(travelNo).size() % 2 == 1) {
				dataPass[2] = Route.travelNo.get(travelNo).get(Route.travelNo.get(travelNo).size() / 2 + 1);
			}
			info = dataPass[0].equals("Karayolu") ? Trip.infoBus
					: (dataPass[0].equals("Demiryolu") ? Trip.infoTrain : Trip.infoAirplane);
			Integer[] dizi = info.get(dataPass[1] + "-" + dataPass[2]);
			profitEarn = dizi[0];
			ciro += profitEarn;
		}
		
	}

	public static void main(String[] args) {

		new Bus("A", "oto1", 20, LocalDateTime.of(2023, 12, 4, 00, 00), 3, "Benzin", 5000, 2000, 10);
		new Bus("A", "oto2", 15, LocalDateTime.of(2023, 12, 4, 01, 00), 3, "Benzin", 5000, 2000, 10);

		new Bus("B", "oto3", 15, LocalDateTime.of(2023, 12, 4, 02, 00), 3, "Motorin", 3000, 1500, 5);
		new Bus("B", "oto4", 20, LocalDateTime.of(2023, 12, 4, 03, 00), 4, "Motorin", 3000, 1500, 5);

		new Bus("C", "oto5", 20, LocalDateTime.of(2023, 12, 4, 00, 30), 4, "Motorin", 4000, 2000, 6);
		new Airplane("C", "pln1", 30, LocalDateTime.of(2023, 12, 4, 01, 30), 5, "Gaz", 10000, 6000, 25);
		new Airplane("C", "pln2", 30, LocalDateTime.of(2023, 12, 4, 02, 30), 5, "Gaz", 10000, 6000, 25);

		new Train("D", "trn1", 25, LocalDateTime.of(2023, 12, 4, 03, 00), 1, "Elektrik", 2000, 1000, 3);
		new Train("D", "trn2", 25, LocalDateTime.of(2023, 12, 4, 03, 30), 2, "Elektrik", 2000, 1000, 3);
		new Train("D", "trn3", 25, LocalDateTime.of(2023, 12, 4, 04, 00), 2, "Elektrik", 2000, 1000, 3);

		new Airplane("F", "pln3", 30, LocalDateTime.of(2023, 12, 4, 03, 00), 6, "Gaz", 7500, 4000, 20);
		new Airplane("F", "pln4", 30, LocalDateTime.of(2023, 12, 4, 04, 00), 6, "Gaz", 7500, 4000, 20);

	}
}