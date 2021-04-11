package deðiþkenler_ve_veri_tipleri;

public class YerelDegiskenler_1 {

	public static void main(String[] args) {
	int sayi=4; // sayi deðiþkeni bu metodda geçerli olan bir yerel deðiþkendir. diðer metodlardan bu deðiþkenin deðeri deðiþtirilemez. 
	metod(sayi);
	System.out.println(sayi);
metod2(); //metodun içindeki deðiþkenler yereldir ve metodun iþi bittiðinde bellekten silinirler . 
metod2(); // metod yeniden çaðýrýldýðýnda bellekten yeniden alan ayrýlýr. bu nedenle eski deðerleri kullanýlmaz. eðer kullanýlsa çýktý 7 olurdu. 
	}
	
	
	static void metod(int sayi){ //buradaki sayi deðiþkenine maindeki sayi deðiþkeninin deðeri deðil deðiþkenin deðerinin kopyasý gönderilir. 
		// yani bu metodla iþ bittikten sonra maine dönüldüðünde deðiþkenin deðerine herhangi bir deðiþiklik yapýlmamýþ olur. 
		sayi*=5;
	}
	
	static void metod2()
	{
		var sayi=5;
		sayi++;
		System.out.println(sayi);
	}

}
