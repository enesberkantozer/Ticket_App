package prolab2;

public class Customer{
	
	private String isim;
	private String soyisim;
	private int idTr;
		
	public Customer(String isim, String soyisim, int idTr) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.idTr = idTr;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getIdTr() {
		return idTr;
	}
	public void setIdTr(int idTr) {
		this.idTr = idTr;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
