import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apachepoi {

	public static void main(String[] args) throws IOException {
		
		Workbook krishnaworkbook=null;
		
		Map<String,String> exceldatas=new LinkedHashMap<String,String>();
		
		File file=new File("D:\\Krishna\\Krishnamaven\\src\\main\\resources\\data\\sampledatsheet.xlsx");
		
		FileInputStream inputstream=new FileInputStream(file);

		System.out.println(inputstream);
		
		String filename=file.toString().substring(file.toString().indexOf("."));  
		//Boolean filename=file.toString().contains(".xlsx");
		System.out.println(filename);
		
		if(filename.equals(".xlsx"))
			krishnaworkbook = new XSSFWorkbook(inputstream);
		else if(filename.equals(".xls"))
			krishnaworkbook = new HSSFWorkbook(inputstream);
		
		Sheet sheet=krishnaworkbook.getSheet("Sheet1");  
		System.out.println("This is the sheet name"+sheet);
		
		int rowcount=sheet.getLastRowNum();
		System.out.println("Total Row count "+rowcount);
		
		Row fixedrow=sheet.getRow(0);

		int lastcellvalue=fixedrow.getLastCellNum();
		System.out.println("Last Cell value "+lastcellvalue);
		
		String check=sheet.getRow(3).getCell(0).getStringCellValue(); 
		System.out.println(check);
		
		for(int i=1;i<=rowcount;i++)
		{
			if(sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase("3"))  //it will take the first row which S.no =1
			{
			for(int j=0;j<lastcellvalue;j++)
			{
				exceldatas.put(fixedrow.getCell(j).getStringCellValue(), sheet.getRow(i).getCell(j).getStringCellValue());
			}
			
			break;  //to store in a map for given if condition
		}
		}
		System.out.println(exceldatas);
		
	}

}
