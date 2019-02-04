import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Greg Tarr
 * Provides interaction with application user.
 *
 */
public class UserInput {

	/**
	 * @return 
	 * Provides album number so main method knows where to 
	 * process JSON from. Prompts user to select which album 
	 * they want to view and returns result to Main method 
	 * as a string value.  
	 */
	public static String getAlbum() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of the album you wish to view (1-100): ");

		int input = 0;
		boolean validInput = false;
		while (!validInput) {
			try {
				input = in.nextInt();
				validInput = true;

			} catch (InputMismatchException e) {
				System.out.println("  ***Invalid Selection***");
				System.out.print("You must select a valid album number between 1-100: ");
				in.nextLine();
			}
		}
		return Integer.toString(input);
	}

	/**
	 * @return
	 * Provides boolean value so Main method knows to stop
	 * or continue.  Prompts the user for input, and returns
	 * boolean value.  
	 */
	public static boolean finished() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Would you like to view another album?");
		System.out.print("Yes or No?   ");

		String response = "";
		boolean selection = false;
		boolean validInput = false;
		
		while (!validInput) {
			response = in.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				selection = false;
				validInput = true;
			} else if (response.equalsIgnoreCase("no")) {
				selection = true;
				validInput = true;
			} else {
				System.out.println("Invalid input. Type yes to select another");
				System.out.print("album, or 'no' to exit the program.   ");
				validInput = false;
			}
		}
		return selection;
	}

}
