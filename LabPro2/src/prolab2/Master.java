package prolab2;

import java.util.ArrayList;
import java.util.List;

import view.LoginFrame;

public class Master {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin.main(null);
		Company.main(null);
		Trip.main(null);
		LoginFrame loginFrame=new LoginFrame();
		loginFrame.execute(0);

	}
}
