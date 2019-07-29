
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry
 * @Date 2019-07-29 08:23
 */
public class WatchLogs {
    private List<OP> ops = new ArrayList<>();

    public void addOP(OP op){
        ops.add(op);
    }

    public void removeOP(OP op){
        ops.remove(op);
    }

    void WatchLog(Logs log){
        for (OP op:ops){
            op.getErrorLogs(log);
            op.getInfoLogs(log);
        }
    }

}
