package version3;

/**
 * @author Jerry
 * @Date 2019-07-23 23:17
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }


    @Override
    public void excute() {
        receiver.action();
    }
}
