package prolab2;

import view.LoginFrame;

abstract class User implements ILoginable {
	public void userLogin() {
		LoginFrame.main(null, 0);
	}

	public void companyLogin() {
		LoginFrame.main(null, 1);
	}

	public void adminLogin() {
		LoginFrame.main(null, 2);
	}

	public static void main(String[] args) {

//		 Kullanıcı paneline dogrudan giris yapılabilir. Kullanıcılar icin herhangi bir uyelik sistemine gerek yoktur.
//  	 Kullanıcı paneline Bilet Ara seklinde bir buton aracılıgıyla gecilebilir.
//		 Belirli bir gundeki ulasım aracların listelenmesi yapılabilir.
//		 Rezervasyon yapılabilir.
//		 Bir kullanıcı aynı anda birden fazla rezervasyon yapabilir.
//		 Bilet aldıktan sonra rezervasyon yapılan yerlerin doldugu anlasılabilmeli ve aynı yer tekrardan bilet rezervasyonuna kapatılmalıdır.
//		 Kullanıcı, bilet rezervasyonu islemine baslamadan once kalkıs noktası, varıs noktası ve yolculuk tarihi secmelidir.
//		 Sistem, kullanıcıya sadece 4-10 Aralık 2023 arasında bulunan 1 haftalık yolculuk tarihlerini gosterecektir.
//		 Kullanıcı ayrıca seyahat edecek yolcu sayısını belirlemelidir.
//		 Kullanıcının secimlerini yapmasının ardından ”Sefer Bul” butonuna tıklanarak uygun seferler sorgulanır.
//		 Sistem, secilen tarihte uygun aracları ve bu aracların koltuk durumlarını gosterecektir.
//		 Kullanıcı, seferler arasından gitmek istedigi firmanın seferini secmelidir.
//		 Secilen sefer ile ilgili bos ve rezerve edilmis koltuk bilgileri goruntulenir.
//		 Kullanıcı, seyahat edecek kisi sayısına gore bos koltukları secmelidir.
//		 Her yolcu icin ayrı bir bilgi girisi ekranı acılır.
//		 Kullanıcı, yolcu adı, soyadı, T.C. numarası, dogum tarihi gibi bilgileri girmelidir.
//		 Tum yolcu bilgileri girisi tamamlandıktan sonra ”Odeme Yap” butonuna tıklanarak odeme islemi yapılacaktır.
//		 Odeme islemi basarıyla tamamlandıgında, secilen sefer ve rezervasyon islemi yapılan koltuklar ekranda goruntulenir.
//		 Rezerve edilen koltuklar, rezervasyon islemi tamamlandıgında gorunur.

	}

}
