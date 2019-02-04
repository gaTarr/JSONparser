import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;

/**
 * The Jackson JSON library is used in this application.
 */

/**
 * @author Greg Tarr
 * Provides methods for processing JSON information.
 *
 */
public class ProcessJSON {

	/**
	 * @param url
	 * This method parses out JSON information from
	 * the URL that is passed as a parameter. 
	 */
	public static void parse(URL url) {

		try {
			JsonFactory jsonfactory = new JsonFactory();
			JsonParser parser = null;

			try {
			parser = jsonfactory.createJsonParser(url);
			} catch (ConnectException e) {
				System.out.println("Connection timed out...");
			} catch (NullPointerException e) {
				e.printStackTrace();
			}

			while (parser.nextToken() != JsonToken.END_OBJECT) {
				String field = parser.getCurrentName();

				if ("albumId".equals(field)) {
					parser.nextToken();
					String album = parser.getText();
					System.out.println();
					System.out.println("> photo-album " + album);
					System.out.println();
				}

				if ("id".equals(field)) {
					parser.nextToken();
					String id = parser.getText();
					System.out.print("[" + id + "] ");
				}

				if ("title".equals(field)) {
					parser.nextToken();
					String title = parser.getText();
					System.out.println(title);
					System.out.println();
				}
			}

			while (parser.nextToken() != JsonToken.END_ARRAY) {
				String field = parser.getCurrentName();

				if ("id".equals(field)) {
					parser.nextToken();
					String id = parser.getText();
					System.out.print("[" + id + "] ");
				}

				if ("title".equals(field)) {
					parser.nextToken();
					String title = parser.getText();
					System.out.println(title);
					System.out.println();
				}
			}
			parser.close();

		} catch (JsonGenerationException j) {
			j.printStackTrace();
		} catch (JsonMappingException j) {
			j.printStackTrace();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
