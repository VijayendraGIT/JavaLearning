package class17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIOStreams {
	
	//FileReader and FileWriter => Perform i/O operations

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("E:\\Work\\JavaLearningClasses2\\JavaLearning\\resources\\inputFile.txt");
			fw = new FileWriter("E:\\Work\\JavaLearningClasses2\\JavaLearning\\resources\\outputFile.txt");
		
			int c = 0;
			while((c=fr.read())!=-1){ // -1 Denotes End of File
				fw.write(c);
				System.out.println((char)c);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			if(fr !=null){
				fr.close();
			}
			if(fw !=null){
				fw.close();
			}
		}
	}
}
