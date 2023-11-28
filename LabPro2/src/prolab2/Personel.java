package prolab2;

public class Personel extends Person{
		
	private boolean isDriver;
	
	public Personel(String companyName, Vehicle vehicleName, String personName, String personSurname, boolean isDriver) {
		super(companyName, vehicleName, personName, personSurname);
		this.isDriver = isDriver;
	}
	
	public boolean isDriver() {
		return isDriver;
	}

	public void setDriver(boolean isDriver) {
		this.isDriver = isDriver;
	}

	public static void main(String[] args) {
//		Bu classta personele ait bilgiler yer alacaktır.
	}

}
