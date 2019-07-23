package version2;

/**
 * @author Jerry
 * @Date 2019-07-23 23:09
 */
public class User {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.addOrder(new BakeChickenWing());
        waiter.addOrder(new BakeMuttonMenu());
        waiter.Notify();

    }
}
