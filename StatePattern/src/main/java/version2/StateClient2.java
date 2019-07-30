package version2;

/**
 * @author Jerry
 * @Date 2019-07-30 09:15
 */
public class StateClient2 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setState("new");
        bike.work();
    }
}
