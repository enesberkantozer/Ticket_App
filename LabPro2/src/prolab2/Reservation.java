package prolab2;

import java.time.LocalDateTime;

public class Reservation extends Customer {
	
	private LocalDateTime reservTime;
	
	public Reservation(String isim, String soyisim, int idTr, LocalDateTime reserv) {
		super(isim, soyisim, idTr);
		this.reservTime = reserv;
		Transport.dataPassanger.add(this);
	}
	
	public LocalDateTime getReserv() {
		return reservTime;
	}
	public void setReserv(LocalDateTime reserv) {
		this.reservTime = reserv;
	}
}
