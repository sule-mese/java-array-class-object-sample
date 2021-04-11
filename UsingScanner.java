package deðiþkenler_ve_veri_tipleri;

import java.util.Scanner;

//ÝN THÝS CODE WE WÝLL LEARN HOW TO PRÝNT AN ÝNTEGER ENTERED BY THE USER 

//In this program, an object of Scanner class, "scan"  is created to take inputs from standard input, which is keyboard.

//If you enter any character which is not an integer, the compiler will throw an "InputMismatchException".

public class UsingScanner {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter an integer number:");
			int num1=scan.nextInt(); // scan.nextInt() reads all entered integers from the keyboard.
			System.out.println("You entered : " + num1); //we use println to display the text.
		}
		

	}

}
