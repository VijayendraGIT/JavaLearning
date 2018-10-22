package class17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileClass {
	
	//File class -  represents Files and directories 
	// file object represents actual physical files or directories on disk
	// FileReader Class - It inherits from InputStreamReader, it reads stream of characters
	

	public static void main(String[] args) throws IOException {

		String path = "E:\\Work\\JavaLearningClasses2\\JavaLearning\\resources";
		File d = new File(path); // Create a new File object
		d.mkdirs(); // create directories
		String [] lists; 
		lists = d.list(); // get directories into the lists array
		
		
		for(String name:lists){
			System.out.println(name); // Print the list
		}
		
		//Creation of file
		File file = new File(path+"\\File.txt");
		try {
			file.createNewFile(); // Create a new File
			//Writing file
			FileWriter writer = new FileWriter(file);
			writer.write("This is File Writing via FileWriter class");
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Reading file
		
		FileReader fr = new FileReader(file);
		int i;
		while((i=fr.read())!=-1){
			System.out.println((char)i);
		}
		
		fr.close();
		
	}

}
