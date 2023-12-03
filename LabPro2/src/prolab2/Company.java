package prolab2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Company extends User implements IProfitable{
	
	private String companyName;
	private String username;
	private String password;
	
	public static int companyCount=0;
	public static ArrayList<Company> companysList = new ArrayList<Company>();
	
	private ArrayList<String> sefer = new ArrayList<>();
	private ArrayList<String> arac = new ArrayList<>();
	
	public Company(String companyName, String username, String password) {
		super();
		this.companyName=companyName;
		this.username=username;
		this.password=password;
		companysList.add(this);
		companyCount++;
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
	
	public int profit(String companyName) {
		
		int price = 1000;
		for(int i = 0; i < Vehicle.vehiclesList.size(); i++) {
			Vehicle v = Vehicle.vehiclesList.get(i);
			if(v.getCompanyName().equals(companyName)) {
				price += ( v.getCostDriver() + v.getCostService() )* 4;
				int a = v.getVehicleTravelNo();
				Map<String, Integer[]> info = new HashMap<>();
				String typeRoute = Route.travelNo.get(a).get(0);
				info = typeRoute.equals("Karayolu") ? Trip.infoBus : 
					(typeRoute.equals("Demiryolu") ? Trip.infoTrain : Trip.infoAirplane);
				for(int j = 1; j < Route.travelNo.get(a).size() -1 ; j++) {
					
					String city = Route.travelNo.get(a).get(j).toString() + "-" 
							+ Route.travelNo.get(a).get(j + 1).toString();
					System.out.println("city: " + city);
					Integer dizi[] = info.get(city); // 0. indis fiyat 1. indis km
					System.out.println("km " + dizi[1]);
			        price += (v.getPriceFuel() * dizi[1]);
				}
			}
		}
		return price;
	}
	
	public static void main(String[] args) {
		
		
// 		metotlar user'dan override edilecek
//		Firma paneline kullanıcı adı ve sifre ile giris yapılmalıdır. Her firma icin arac bilgisi bilgileri de kaydedilmelidir
// 		Arac ekleme ve cıkarma yapılabilir.
// 		Sefer ekleme ve cıkarma yapılabilir.
// 		Gunluk kar hesabı yapılabilir. Gunluk kar hesabı yolcu ucretleri, hizmet bedeli, personel maliyeti ve yakıt maliyeti dikkate alınarak hesaplanmalıdır.
		new Bus("A", "oto1", 20, LocalDateTime.of(2023, 12, 4, 00, 00), 3, "Benzin", 5000, 2000, 10);
		new Bus("A", "oto2", 15, LocalDateTime.of(2023, 12, 4, 01, 00), 3, "Benzin", 5000, 2000, 10);
		
		new Bus("B", "oto3", 15, LocalDateTime.of(2023, 12, 4, 02, 00), 3, "Motorin", 3000, 1500, 5);
		new Bus("B", "oto4", 20, LocalDateTime.of(2023, 12, 4, 03, 00), 4, "Motorin", 3000, 1500, 5);
		
		new Bus("C", "oto5", 20, LocalDateTime.of(2023, 12, 4, 00, 30), 4, "Motorin", 4000, 2000, 6);
		new Airplane("C", "pln1", 30, LocalDateTime.of(2023, 12, 4, 01, 30), 5, "Gaz", 10000, 6000, 25);
		new Airplane("C", "pln2", 30, LocalDateTime.of(2023, 12, 4, 02, 30), 5, "Gaz", 10000, 6000, 25);
		
		new Train("D", "trn1", 25, LocalDateTime.of(2023, 12, 4, 03, 00), 1, "Elektrik", 2000, 1000, 3);
		new Train("D", "trn2", 25, LocalDateTime.of(2023, 12, 4, 03, 30), 2, "Elektrik", 2000, 1000, 3);
		new Train("D", "trn3", 25, LocalDateTime.of(2023, 12, 4, 04, 00), 2, "Elektrik",2000, 1000, 3);
		
		new Airplane("F", "pln3", 30, LocalDateTime.of(2023, 12, 4, 03, 00), 6, "Gaz", 7500, 4000, 20);
		new Airplane("F", "pln4", 30, LocalDateTime.of(2023, 12, 4, 04, 00), 6, "Gaz", 7500, 4000, 20);

	}
 }