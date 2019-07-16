package guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry
 * @Date 2019-07-16 23:50
 */
public class Classs implements Fuwu {

    private List<User> users = new ArrayList<>(10);

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void delUser(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUser() {
        users.forEach(s -> s.update("消息更新为111"));
    }
}
