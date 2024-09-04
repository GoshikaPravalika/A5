package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelUsingMethodChaining {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		double data = wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		//int a=(int)data;
		System.out.println(data);
		//System.out.println(a);
		wb.close();
	}

}
