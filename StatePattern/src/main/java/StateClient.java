/**
 * @author Jerry
 * @Date 2019-07-18 08:51
 */
public class StateClient {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setState(new NewBike());
        bike.state();
        bike.setState(new OldBike());
        bike.state();
    }
}
