package geometricShapes.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		// System.in; ->>referea fereastra Console
		// Scanner

		System.out.println("Please type something!");
		Scanner sc = new Scanner(System.in);
		// int i = sc.nextInt(); // this is how to read a number
		// String i = sc.next(); //this is how u read a string until a first space
		String i = sc.nextLine(); // reads until Enter is pressed
		System.out.println("You have typed: " + i);
	}

}
