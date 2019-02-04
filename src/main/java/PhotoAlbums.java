
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Greg Tarr
 * This program displays photos from an online web service. 
 * Users are prompted to select which album they want to view,
 * then based on their input, the program returns the number and
 * title of each photo in the album. 
 * 
 */

/**
 * @author Greg Tarr 
 * 		   Provides the Main class of the application. It
 *         calls the UserInput file to get the desired album number, and the
 *         ProcessJSON file to get the album information. Finally, it calls the
 *         UserInput file to either continue, or exit.
 *
 */
public class PhotoAlbums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean done = false;

		System.out.println();
		System.out.println("************ There are 100 Photo Albums *************");
		System.out.println();

		while (!done) {
			URL input = null;
			String albumNumber = UserInput.getAlbum();

			try {
				input = new URL("https://jsonplaceholder.typicode.com/photos?albumId=" + albumNumber);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

			ProcessJSON.parse(input);

			boolean choice = UserInput.finished();
			done = choice;

		}
		System.out.println("Goodbye!");
		System.exit(0);
	}
}
