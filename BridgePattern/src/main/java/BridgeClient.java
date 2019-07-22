/**
 * @author Jerry
 * @Date 2019-07-22 07:54
 */
public class BridgeClient {

    public static void main(String[] args) {
        ExcelToEntity excelToEntity = new DefaultExcelToEntity();
        excelToEntity.setExcelCheck(new ExcelCheckImpl());
        excelToEntity.startRead();
    }
}
