package prolab2;

abstract public class Person {
	
	private Company companyName;
	private String personName;
	private String personSurname;
	
	public Person(Company companyName, String personName, String personSurname) {
		this.companyName = companyName;
		this.personName = personName;
		this.personSurname = personSurname;
	}
	
	public Company getCompanyName() {
		return companyName;
	}
	public void setCompanyName(Company companyName) {
		this.companyName = companyName;
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
