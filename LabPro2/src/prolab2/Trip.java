package prolab2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trip {

	public static Map<String, Integer[]> infoBus = new HashMap<>();
	public static Map<String, Integer[]> infoTrain = new HashMap<>();
	public static Map<String, Integer[]> infoAirplane = new HashMap<>();

	public static void main(String[] args) {

		new Route(1, new ArrayList<String>(List.of("Demiryolu", "İstanbul", "Kocaeli", "Bilecik", "Eskişehir", "Ankara",
				"Eskişehir", "Bilecik", "Kocaeli", "İstanbul")));
		
		new Route(2, new ArrayList<String>(List.of("Demiryolu", "İstanbul", "Kocaeli", "Bilecik", "Eskişehir", "Konya", 
				"Eskişehir", "Bilecik", "Kocaeli", "İstanbul")));
		
		new Route(3, new ArrayList<String>(List.of("Karayolu", "İstanbul", "Kocaeli", "Ankara", "Kocaeli", "İstanbul")));
		
		new Route(4, new ArrayList<String>(List.of("Karayolu", "İstanbul", "Kocaeli", "Eskişehir", "Konya",
				"Eskişehir", "Kocaeli", "İstanbul")));
		
		new Route(5, new ArrayList<String>(List.of("Havayolu", "İstanbul", "Konya", "İstanbul")));
		new Route(6, new ArrayList<String>(List.of("Havayolu", "İstanbul", "Ankara", "İstanbul")));

		infoBus.put("İstanbul-Kocaeli", new Integer[] { 50, 100 }); //  fiyat, km
		infoBus.put("İstanbul-Eskişehir", new Integer[] { 150, 300 });
		infoBus.put("İstanbul-Ankara", new Integer[] { 300, 500 });
		infoBus.put("İstanbul-Konya", new Integer[] { 300, 600 });
		infoBus.put("Kocaeli-Eskişehir", new Integer[] { 100, 200 });
		infoBus.put("Kocaeli-Ankara", new Integer[] { 400, 400 });
		infoBus.put("Kocaeli-Konya", new Integer[] { 250, 500 });
		infoBus.put("Eskişehir-Konya", new Integer[] { 150, 300 });

		infoBus.put("Kocaeli-İstanbul", new Integer[] { 50, 100 });
		infoBus.put("Eskişehir-İstanbul", new Integer[] { 150, 300 });
		infoBus.put("Ankara-İstanbul", new Integer[] { 300, 500 });
		infoBus.put("Konya-İstanbul", new Integer[] { 300, 600 });
		infoBus.put("Eskişehir-Kocaeli", new Integer[] { 100, 200 });
		infoBus.put("Ankara-Kocaeli", new Integer[] { 400, 400 });
		infoBus.put("Konya-Kocaeli", new Integer[] { 250, 500 });
		infoBus.put("Konya-Eskişehir", new Integer[] { 150, 300 });

		infoTrain.put("İstanbul-Kocaeli", new Integer[] { 50, 75 });
		infoTrain.put("İstanbul-Bilecik", new Integer[] { 150, 225 });
		infoTrain.put("İstanbul-Eskişehir", new Integer[] { 200, 300 });
		infoTrain.put("İstanbul-Ankara", new Integer[] { 250, 375 });
		infoTrain.put("İstanbul-Konya", new Integer[] { 300, 450 });
		infoTrain.put("Kocaeli-Bilecik", new Integer[] { 50, 75 });
		infoTrain.put("Kocaeli-Eskişehir", new Integer[] { 100, 150 });
		infoTrain.put("Kocaeli-Ankara", new Integer[] { 200, 300 });
		infoTrain.put("Kocaeli-Konya", new Integer[] { 250, 350 });
		infoTrain.put("Bilecik-Eskişehir", new Integer[] { 50, 75 });
		infoTrain.put("Bilecik-Ankara", new Integer[] { 150, 225 });
		infoTrain.put("Bilecik-Konya", new Integer[] { 200, 300 });
		infoTrain.put("Eskişehir-Ankara", new Integer[] { 100, 150 });
		infoTrain.put("Eskişehir-Konya", new Integer[] { 150, 225 });

		infoTrain.put("Kocaeli-İstanbul", new Integer[] { 50, 75 });
		infoTrain.put("Bilecik-İstanbul", new Integer[] { 150, 225 });
		infoTrain.put("Eskişehir-İstanbul", new Integer[] { 200, 300 });
		infoTrain.put("Ankara-İstanbul", new Integer[] { 250, 375 });
		infoTrain.put("Konya-İstanbul", new Integer[] { 300, 450 });
		infoTrain.put("Bilecik-Kocaeli", new Integer[] { 50, 75 });
		infoTrain.put("Eskişehir-Kocaeli", new Integer[] { 100, 150 });
		infoTrain.put("Ankara-Kocaeli", new Integer[] { 200, 300 });
		infoTrain.put("Konya-Kocaeli", new Integer[] { 250, 350 });
		infoTrain.put("Eskişehir-Bilecik", new Integer[] { 50, 75 });
		infoTrain.put("Ankara-Bilecik", new Integer[] { 150, 225 });
		infoTrain.put("Konya-Bilecik", new Integer[] { 200, 300 });
		infoTrain.put("Ankara-Eskişehir", new Integer[] { 100, 150 });
		infoTrain.put("Konya-Eskişehir", new Integer[] { 150, 225 });

		infoAirplane.put("İstanbul-Ankara", new Integer[] { 1000, 250 });
		infoAirplane.put("İstanbul-Konya", new Integer[] { 1200, 300 });

		infoAirplane.put("Ankara-İstanbul", new Integer[] { 1000, 250 });
		infoAirplane.put("Konya-İstanbul", new Integer[] { 1200, 300 });
	}

	public static ArrayList<String> seferBul(String kalkis, String varis, LocalDateTime date) {

		ArrayList<String> tripDetail=new ArrayList<String>();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MMM.yyyy HH:mm");
		for (int i = 1; i <= Route.travelNo.size(); i++) {
			ArrayList<String> route=Route.travelNo.get(i);
			if(route.contains(kalkis)&&route.contains(varis)) {
				System.out.println(i);
				for (int j = 0; j < Vehicle.vehiclesList.size(); j++) {
					Vehicle v=Vehicle.vehiclesList.get(j);
					if(date.getDayOfYear()<=v.getBeginTime().getDayOfYear()&& date.getYear()<=v.getBeginTime().getYear()) {
						if(v.getVehicleTravelNo()==i) {
							System.out.print(v.getCompanyName()+" firmasının ");
							System.out.print(v.getVehicleTravelNo()+" sefer sayılı ");
							System.out.print(v.getVehicleCapacity()+" kişilik ");
							System.out.print((v instanceof Bus)? "otobüsü ": (v instanceof Train)? "treni ": "uçağı ");
							System.out.print(v.getBeginTime().format(formatter)+" saat ve ");
							System.out.print(route.get(1)+" kalkışlı seferi vardır. ");
							System.out.print(kalkis+" şehrine ");
							int to=route.indexOf(kalkis)-1;
							System.out.println(v.getBeginTime().plusMinutes(45*to).format(formatter)+ " saatinde ulaşacaktır.");
							tripDetail.add(v.getCompanyName());
							tripDetail.add((v instanceof Bus)? "Otobüs": (v instanceof Train)? "Tren": "Uçak");
							tripDetail.add(String.valueOf(v.getVehicleCapacity()));
							tripDetail.add(v.getBeginTime().plusMinutes(45*to).format(formatter));
							if(v instanceof Bus) {
								tripDetail.add(String.valueOf(infoBus.get(kalkis+"-"+varis)[0]));
							}
							else if(v instanceof Train) {
								tripDetail.add(String.valueOf(infoTrain.get(kalkis+"-"+varis)[0]));
							}
							else if(v instanceof Airplane) {
								tripDetail.add(String.valueOf(infoAirplane.get(kalkis+"-"+varis)[0]));
							}
							tripDetail.add(v.getVehicleId());
						}
					}
				}
			}
		}
		return tripDetail;
	}
}
