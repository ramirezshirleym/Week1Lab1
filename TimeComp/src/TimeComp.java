import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);

		int secondsIn;
		int minutes;
		int hours;
		int secondsOut;

		// Read in number entered by user
		System.out.print("Enter a number of seconds: ");
		secondsIn = scan.nextInt();

		// Stop scan from awaiting further input
		scan.close();

		hours = secondsIn / 3600; 				//Get hours (3600sec/hr)
		minutes = (secondsIn % 3600) / 60; 		//Get mins from remaining seconds (60sec/min)
		secondsOut = (secondsIn % 3600) % 60; 	//Remaining seconds

		System.out.println();
		System.out.print(hours + " hours, " + minutes + " minutes, " + secondsOut + " seconds");

	}

}
