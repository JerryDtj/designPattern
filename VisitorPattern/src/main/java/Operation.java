/**
 * @author Jerry
 * @Date 2019-07-29 08:21
 */
public class Operation implements OP {
    @Override
    public void getErrorLogs(Logs logs) {
        System.out.println("operation watch error logs size");
    }

    @Override
    public void getInfoLogs(Logs logs) {
        System.out.println("operation watch info logs size");
    }
}
