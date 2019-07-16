package guanchazhe;

/**
 * @author Jerry
 * @Date 2019-07-16 23:55
 */
public class Student implements User {
    @Override
    public void update(String s) {
        System.out.println("更新的消息为："+s);
    }
}
