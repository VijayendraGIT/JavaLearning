package class17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreams {
	
	//1. Byte Stream - used to perform operations input /output operations in 8 bit bytes
	//2. Character Streams - performs 16 bit i.e 2 bytes at a time

	// Byte Streams - FileInputStream and FileOutputStreams classes
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("E:\\Work\\JavaLearningClasses2\\JavaLearning\\resources\\input.txt");
			out = new FileOutputStream("E:\\Work\\JavaLearningClasses2\\JavaLearning\\resources\\output.txt");
			
			int c = 0;
			
			while((c=in.read())!= -1){
				out.write(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		finally{
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
	}

}
