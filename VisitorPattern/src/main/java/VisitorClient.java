/**
 * @author Jerry
 * @Date 2019-07-28 11:51
 */
public class VisitorClient {
    public static void main(String[] args) {
        WatchLogs watchLogs = new WatchLogs();
        watchLogs.addOP(new Operation());
        watchLogs.addOP(new Programmer());
        watchLogs.WatchLog(new ErrorLogs());
    }
}
