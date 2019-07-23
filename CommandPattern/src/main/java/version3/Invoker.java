package version3;

/**
 * @author Jerry
 * @Date 2019-07-23 23:20
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.excute();
    }
}
