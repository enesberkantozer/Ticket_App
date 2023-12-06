package prolab2;

public class Personel extends Person{
		
	private boolean isDriver;
	
	public Personel(String companyName, String vehicleName, String personName, String personSurname, boolean isDriver) {
		super(companyName, vehicleName, personName, personSurname);
		this.isDriver = isDriver;
	}
	
	public boolean isDriver() {
		return isDriver;
	}

	public void setDriver(boolean isDriver) {
		this.isDriver = isDriver;
	}
}
