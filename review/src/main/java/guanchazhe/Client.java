package guanchazhe;

/**
 * @author Jerry
 * @Date 2019-07-16 23:58
 */
public class Client {
    public static void main(String[] args) {
        Classs classs = new Classs();
        classs.addUser(new Student());
        classs.notifyUser();
    }

}
