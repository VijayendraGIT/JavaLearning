package class17;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReaders {
	// Standard Streams:
	// 1. Standard input - keyboard - System.in
	// 2. Standard output - Computer Screen - System.out
	// 3. Standard Error - Computer Screen - System.err

	public static void main(String[] args) throws IOException {

		InputStreamReader in = null;

		in = new InputStreamReader(System.in);
		System.out.println("Enter characters and 'q' to quit !!");
		char c;
		try {
			do {
				c = (char) in.read();
				System.out.println(c);

			} while (c != 'q');
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(in !=null){
				in.close();
			}
		}

	}

}
