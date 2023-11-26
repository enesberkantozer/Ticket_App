package prolab2;

abstract public class Person {

	private Company companyName;
	private Vehicle vehicleName;
	private String personName;
	private String personSurname;
	
	public Person(Company companyName, Vehicle vehicleName, String personName, String personSurname) {
		this.companyName = companyName;
		this.vehicleName = vehicleName;
		this.personName = personName;
		this.personSurname = personSurname;
	}
	
	public Company getCompanyName() {
		return companyName;
	}
	public void setCompanyName(Company companyName) {
		this.companyName = companyName;
	}
	
	public Vehicle getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(Vehicle vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonSurname() {
		return personSurname;
	}
	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}

	public static void main(String[] args) {
//		Bu classta Ad ve soyad bilgileri icermelidir
	}

}
