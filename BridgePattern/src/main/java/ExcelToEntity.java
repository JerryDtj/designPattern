/**
 * @author Jerry
 * @Date 2019-07-22 07:43
 */
public abstract class ExcelToEntity {
    protected ExcelCheck excelCheck;

    public void setExcelCheck(ExcelCheck excelCheck) {
        this.excelCheck = excelCheck;
    }

    abstract void readExcel();

    final void startRead(){
        excelCheck.rowCheck();
        excelCheck.cellCheck();
        readExcel();
    }

}
