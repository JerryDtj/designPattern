/**
 * @author Jerry
 * @Date 2019-07-13 08:31
 */
public class User implements Observer {
    @Override
    public void update(String message) {
        System.out.println("服务端更新了："+message);
    }
}
