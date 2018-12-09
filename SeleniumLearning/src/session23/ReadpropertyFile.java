package session23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		File file = new File(System.getProperty("user.dir")+"//object.properties");
		FileInputStream stream = new FileInputStream(file);
		
		p.load(stream);

		System.out.println("url ="+p.getProperty("url"));
		System.out.println("name ="+p.getProperty("name"));
	}

}
