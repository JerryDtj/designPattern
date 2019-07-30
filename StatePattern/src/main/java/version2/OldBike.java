package version2;

/**
 * @author Jerry
 * @Date 2019-07-30 09:06
 */
public class OldBike implements State {
    @Override
    public void getState(Bike bike) {
        System.out.println("老车，不舒服");
    }
}
