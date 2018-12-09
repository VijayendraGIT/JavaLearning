package session22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadAndWrite {
	
	/*              XLS				XLSX
	 * Workbook  HSSFWorkbook	XSSFWorkbook
	 * Sheet	 HSSFSheet		XSSFSheet
	 * Row		 HSSFRow		XSSFRow
	 * Cell		 HSSFCell		XSSFCell
	 * 
	 */

	
	public static void main(String[] args) throws IOException {
		
	 String filepath = System.getProperty("user.dir");
		System.out.println(filepath);
		String filename = filepath+"\\xls-example.xlsx";
		//1. Create a file object with filepath along with filename
		File file = new File(filename);
		
		//2. Create object of i/p stream to read excel file
		FileInputStream  inputStream = new FileInputStream(file);
		
		//3. Find extenstion of the file 
		String extention = filename.substring(filename.indexOf("."));
		
		//4. create object of Workbook 
		Workbook book = null;
		
		// 5. Open  file using right class
		if(extention.equals(".xlsx")){
			book = new XSSFWorkbook(inputStream);
		} else if(extention.equals(".xls")){
			book = new HSSFWorkbook(inputStream);
		}
		
		//6. Read Sheet
		Sheet sheet = book.getSheet("ExampleTest");
		
		//7. Find Rows
		int rowNo = sheet.getLastRowNum();
		
		//8. use Loop to read cells
		for(int i =0;i<rowNo+1;i++){ //Iterate through rows
			Row row = sheet.getRow(i);
			//9. Create another loop to iterate through cells of selected row
			for(int j=0;j<row.getLastCellNum();j++){
				//10. Check for cell types and read cell value
				System.out.println("i ="+i);
				int type = row.getCell(i).getCellType();
				System.out.println("Type = "+type+" | "+ "j ="+j);
				if(type == 0){ // Numbers
					System.out.println(row.getCell(j).getNumericCellValue()+" | ");
				} else if(type ==1){ //String
					System.out.print(row.getCell(j).getStringCellValue()+" | ");
				} else if(type ==2){ // Cell contains formula => Actual value of cell
					System.out.println(row.getCell(j).getCachedFormulaResultType()+" | ");
				} else if(type ==3){ //Cell is Empty
					System.out.println(row.getCell(j).getStringCellValue()+" | ");
				} else if(type ==4){ // Cell is Boolean
					System.out.println(row.getCell(j).getBooleanCellValue()+" | ");
				}
				
				
			}
			row.createCell(row.getLastCellNum()).setCellValue("Test");
			System.out.println();
		}
		
		//Saving file 3 steps
		// 1. Open output stream
		FileOutputStream fout = new FileOutputStream(new File(filename));
		// 2. Write into excel book
		book.write(fout);
		// 3.Close output stream
		fout.close();

	}

}
