import java.util.ArrayList;
import java.util.List;

/**
 *
 * 被观察者，也就是微信server端
 *
 * @author Jerry
 * @Date 2019-07-13 08:23
 */
public class WebChatServer implements Subject {

    private List<Observer> serverList = new ArrayList();
    public String message;

    @Override
    public void attach(Observer observer) {
        serverList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        serverList.remove(observer);
    }

    @Override
    public void notifyObs() {
        serverList.forEach(o -> o.update(message));
    }
}
