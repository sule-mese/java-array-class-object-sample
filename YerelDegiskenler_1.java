package de�i�kenler_ve_veri_tipleri;

public class YerelDegiskenler_1 {

	public static void main(String[] args) {
	int sayi=4; // sayi de�i�keni bu metodda ge�erli olan bir yerel de�i�kendir. di�er metodlardan bu de�i�kenin de�eri de�i�tirilemez. 
	metod(sayi);
	System.out.println(sayi);
metod2(); //metodun i�indeki de�i�kenler yereldir ve metodun i�i bitti�inde bellekten silinirler . 
metod2(); // metod yeniden �a��r�ld���nda bellekten yeniden alan ayr�l�r. bu nedenle eski de�erleri kullan�lmaz. e�er kullan�lsa ��kt� 7 olurdu. 
	}
	
	
	static void metod(int sayi){ //buradaki sayi de�i�kenine maindeki sayi de�i�keninin de�eri de�il de�i�kenin de�erinin kopyas� g�nderilir. 
		// yani bu metodla i� bittikten sonra maine d�n�ld���nde de�i�kenin de�erine herhangi bir de�i�iklik yap�lmam�� olur. 
		sayi*=5;
	}
	
	static void metod2()
	{
		var sayi=5;
		sayi++;
		System.out.println(sayi);
	}

}
