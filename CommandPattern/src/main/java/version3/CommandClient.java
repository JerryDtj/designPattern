package version3;

/**
 * @author Jerry
 * @Date 2019-07-23 23:23
 */
public class CommandClient {
    public static void main(String[] args) {
        Invoker invoker  = new Invoker();
        invoker.setCommand(new ConcreteCommand(new Receiver()));
        invoker.executeCommand();
    }

}
