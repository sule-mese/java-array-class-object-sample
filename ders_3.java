package de�i�kenler_ve_veri_tipleri;
import java.util.Locale;
import java.util.Scanner;

public class ders_3 {
	//kullan�c�dan input alma
	public static void main(String[] args) {
	
		    try (Scanner scan = new Scanner(System.in)) {
				scan.useLocale(Locale.US); // scan bilgileri amerika sintax�na g�re alacak diye se�tim.
				
				
				System.out.println("Bir sayi giriniz:");
				double a = scan.nextDouble();
				System.out.println("Sayinin degeri " + a);
				
				System.out.println("Bir yazi giriniz:");
				String b = scan.next(); // scan s�n�f�n�n next metodu ile klavyeden string ald�m de�i�kene atad�m.
				System.out.println("Yazinin degeri:" + b);
			}
	}
}
	


