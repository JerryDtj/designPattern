/**
 * @author Jerry
 * @Date 2019-07-22 07:49
 */
public class ExcelCheckImpl implements ExcelCheck {
    @Override
    public boolean rowCheck() {
        System.out.println("start row check");
        return true;
    }

    @Override
    public boolean cellCheck() {
        System.out.println("start cell check");
        return false;
    }
}
