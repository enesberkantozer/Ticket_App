package prolab2;

import java.util.ArrayList;

public class Storage {
	private static ArrayList<Company> companysData=new ArrayList<Company>();

	public static ArrayList<Company> getCompanysData() {
		return companysData;
	}
	
	public static void addCompanyData(Company company) {
		companysData.add(company);
	}
}
