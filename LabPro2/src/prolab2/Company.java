package prolab2;

import java.util.ArrayList;

public class Company extends User implements IProfitable{
	
	private ArrayList<String> sefer = new ArrayList<>();
	private ArrayList<String> arac = new ArrayList<>();
	
	public Company(String companyName) {
		super();
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
		Company cmp1 = new Company("cpm1");
		cmp1.Login(1);
	}
}
