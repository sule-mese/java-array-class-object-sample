package de�i�kenler_ve_veri_tipleri;

public class Encoding_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String selamInJapanese = "\u4eca\u65e5\u306f\u4e16\u754c";
		System.out.println("Japonca da Selam D�nya: \t" + selamInJapanese);
		// Notice \n
		System.out.print("Ya da\n");

		char ch1 = '\u4eca';
		char ch2 = '\u65e5';
		char ch3 = '\u306f';
		char ch4 = '\u4e16';
		char ch5 = '\u754c';

		System.out.println("Japonca da Selam D�nya: \t" + ch1 + ch2 + ch3 + ch4 + ch5);

		String selamInArabic = "\u0633\u0644\u0627\u0645";
		System.out.println("Arap�a Selam: \t\t\t" + selamInArabic); // Notice \t
		
		String selamInHebrew = "\u05e9\u05dc\u05d5\u05dd";
		System.out.println("Ibranice Selam: \t\t" + selamInHebrew);   // komut sat�r�ndan eri�im yapal�m...

	}

}
