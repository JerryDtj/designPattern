/**
 * @author Jerry
 * @Date 2019-07-29 08:17
 */
public class Programmer implements OP {
    @Override
    public void getErrorLogs(Logs logs) {
        System.out.println("programmer get error logs");
    }

    @Override
    public void getInfoLogs(Logs logs) {
        System.out.println("programmer watch info logs");
    }
}
