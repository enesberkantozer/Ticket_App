package prolab2;

import java.time.LocalDateTime;

public class Reservation extends Customer {
	
	private LocalDateTime reservTime;
	
	public Reservation(String isim, String soyisim, int idTr, LocalDateTime reserv) {
		super(isim, soyisim, idTr);
		this.reservTime = reserv;
		Passenger.dataPassanger.add(this);
	}
	
	public LocalDateTime getReserv() {
		return reservTime;
	}
	public void setReserv(LocalDateTime reserv) {
		this.reservTime = reserv;
	}

	public static void main(String[] args) {
//		Her rezervasyonun yolcu, arac ve koltuk bilgisi bulunmalıdır
	}

}
