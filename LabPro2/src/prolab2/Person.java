package prolab2;

abstract public class Person {

	private String companyName;
	private String vehicleName;
	private String personName;
	private String personSurname;
	
	public Person(String companyName, String vehicleName, String personName, String personSurname) {
		this.companyName = companyName;
		this.vehicleName = vehicleName;
		this.personName = personName;
		this.personSurname = personSurname;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
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
}
