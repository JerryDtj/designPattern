package version2;

/**
 * @author Jerry
 * @Date 2019-07-30 09:05
 */
public class NewBike implements State {
    @Override
    public void getState(Bike bike) {
        System.out.println("新车 很舒服");
    }
}
