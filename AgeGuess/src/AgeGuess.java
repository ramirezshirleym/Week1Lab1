import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);

		String name;
		int ageGuess;

		// Read in the name entered by user
		System.out.print("Enter a name: ");
		name = scan.nextLine();

		// Read in the age guess entered by user
		System.out.print("Enter an age guess: ");
		ageGuess = scan.nextInt();

		// Stop scan from awaiting further input
		scan.close();

		// Display variable values
		System.out.println();
		System.out.println("name: " + name);
		System.out.println("ageGuess: " + ageGuess);

	}

}
