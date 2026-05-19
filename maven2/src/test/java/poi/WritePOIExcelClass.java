package poi;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class WritePOIExcelClass {

//			public static void main(String[] args) throws IOException {
		    public static  void main(String args[]) throws IOException {
		        //old version -->XSSH //new version--->XSSF
		    	
		    	//Create an object of File class to open xlsx file
		        File file =    new File("C:\\Users\\Bharti Arora\\Desktop\\Book1.xlsx");
		        
		        //Create an object of FileInputStream class to read excel file
		        FileInputStream inputStream = new FileInputStream(file);
		        
		        //creating workbook instance that refers to .xls/ .xlsx file
		        XSSFWorkbook wb=new XSSFWorkbook(inputStream); //takes cursor there
		        
		        //creating a Sheet object using the sheet Name
		        XSSFSheet sheet=wb.getSheet("SamplePOISheet4");
		        
		        //Create a row object to retrieve row at index 3
		        
		        XSSFRow rownew1=sheet.createRow(0);
		        
		        //create a cell object to enter value in it using cell Index
		        rownew1.createCell(0).setCellValue("Gaurav");
		        rownew1.createCell(1).setCellValue("prince");
		        rownew1.createCell(2).setCellValue("atiksh@gmail.com");
		        rownew1.createCell(3).setCellValue("male");
		        rownew1.createCell(4).setCellValue("9717610870");
		        rownew1.createCell(5).setCellValue("vaishali");
		        
		        XSSFRow rowneww=sheet.createRow(1);
		        //create a cell object to enter value in it using cell Index
		        rowneww.createCell(0).setCellValue("Bharti");
		        rowneww.createCell(1).setCellValue("Arora");
		        
		 XSSFRow rownew=sheet.createRow(2);
		        
		        //create a cell object to enter value in it using cell Index
		        rownew.createCell(0).setCellValue("shivam");
		        rownew.createCell(1).setCellValue("prince");
		        rownew.createCell(2).setCellValue("atiksh@gmail.com");
		        rownew.createCell(3).setCellValue("male");
		        rownew.createCell(4).setCellValue("9717610870");
		        rownew.createCell(5).setCellValue("vaishali");
		        
		XSSFRow rownew2=sheet.createRow(3);
		        
		        //create a cell object to enter value in it using cell Index
		        rownew2.createCell(0).setCellValue("Ramesh");
		        rownew2.createCell(1).setCellValue("prince");
		        rownew2.createCell(2).setCellValue("atiksh@gmail.com");
		        rownew2.createCell(3).setCellValue("male");
		        rownew2.createCell(4).setCellValue("9717610870");
		        rownew2.createCell(5).setCellValue("vaishali");
		        
		        //write the data in excel using output stream
		        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Bharti Arora\\Desktop\\Book1.xlsx");
		        wb.write(outputStream);
		        wb.close();
		        System.out.println("Completed");
		        
		        /*
		         * <dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
		<version>5.2.4</version>
		</dependency>

		<!--  https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml  -->
		<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>5.2.4</version>
		</dependency>
		<!--  https://mvnrepository.com/artifact/commons-io/commons-io  -->
		<dependency>
		<groupId>commons-io</groupId>
		<artifactId>commons-io</artifactId>
		<version>2.13.0</version>
		</dependency>
		         */

		    }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//			String path = "C:\\Users\\Bharti Arora\\Desktop\\Book1.xlsx";
//			FileInputStream fis = new FileInputStream(path);
//			try (Workbook workbook = new XSSFWorkbook(fis)) {
//				Sheet sheet = workbook.getSheet("SamplePOISheet");
//				int lastRow = sheet.getLastRowNum();
//				for(int i=1; i<=lastRow; i++){
//				Row row = sheet.getRow(i);
//				Cell cell = row.createCell(2);
//				cell.setCellValue("32");
//				}
//				FileOutputStream fos = new FileOutputStream(path);
//				workbook.write(fos);
//				fos.close();
//				System.out.println("Completed");
//			}
//			}

}
