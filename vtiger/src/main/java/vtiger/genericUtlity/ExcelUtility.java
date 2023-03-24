package vtiger.genericUtlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this method is use to fatch th edata from excelsgeet
 * @author ranik
 *
 */
public class ExcelUtility {
	/**
	 * This method fetches data from excel sheet
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String fetchDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(IPathConstant.EXCELFILEPATH);
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
		
	}
}
