package deðiþkenler_ve_veri_tipleri;
import java.util.Locale;
import java.util.Scanner;

public class ders_3 {
	//kullanýcýdan input alma
	public static void main(String[] args) {
	
		    try (Scanner scan = new Scanner(System.in)) {
				scan.useLocale(Locale.US); // scan bilgileri amerika sintaxýna göre alacak diye seçtim.
				
				
				System.out.println("Bir sayi giriniz:");
				double a = scan.nextDouble();
				System.out.println("Sayinin degeri " + a);
				
				System.out.println("Bir yazi giriniz:");
				String b = scan.next(); // scan sýnýfýnýn next metodu ile klavyeden string aldým deðiþkene atadým.
				System.out.println("Yazinin degeri:" + b);
			}
	}
}
	


