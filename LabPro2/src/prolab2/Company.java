package prolab2;

import java.util.ArrayList;

public class Company extends User implements IProfitable{
	
	private String companyName;
	private String username;
	private String password;
	
	public static int companyCount=0;
	public static ArrayList<Company> companysList = new ArrayList<Company>();
	
	private ArrayList<String> sefer = new ArrayList<>();
	private ArrayList<String> arac = new ArrayList<>();
	
	public Company(String companyName, String username, String password) {
		super();
		this.companyName=companyName;
		this.username=username;
		this.password=password;
		companysList.add(this);
		companyCount++;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getSefer(int x) {
		return sefer.get(x);
	}	
	public void setSefer(String deger) {
		sefer.add(deger);
	}
	
	public String getArac(int x) {
		return arac.get(x);
	}
	public void setArac(String deger) {
		arac.add(deger);
	}
	
	public static void main(String[] args) {
		
		
// 		metotlar user'dan override edilecek
//		Firma paneline kullanıcı adı ve sifre ile giris yapılmalıdır. Her firma icin arac bilgisi bilgileri de kaydedilmelidir
// 		Arac ekleme ve cıkarma yapılabilir.
// 		Sefer ekleme ve cıkarma yapılabilir.
// 		Gunluk kar hesabı yapılabilir. Gunluk kar hesabı yolcu ucretleri, hizmet bedeli, personel maliyeti ve yakıt maliyeti dikkate alınarak hesaplanmalıdır.

		new Personel("A", "oto1", "emre", "algan", true);
	}
 }