package prolab2;

import view.LoginFrame;

public class Master {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Admin.main(null);
		Company.main(null);
		Trip.main(null);
		LoginFrame loginFrame=new LoginFrame();
		loginFrame.execute(0);
		System.out.println(Company.companysList.get(0).profit("F"));

	}
}
