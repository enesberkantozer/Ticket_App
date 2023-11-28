package prolab2;

import java.util.ArrayList;

public class ControlLogin {
	public Company getCompany(String username,String password) {
		ArrayList<Company> company=Company.companysList;
		for(int i=0;i<Company.companyCount;i++) {
			if(company.get(i).getUsername().equals(username) && company.get(i).getPassword().equals(password)) {
				return company.get(i);
			}
		}
		return null;
	}
}
