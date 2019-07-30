package version1;

/**
 * @author Jerry
 * @Date 2019-07-18 08:52
 */
public class OldBike implements BikeState {

    @Override
    public void getStatue(Bike bike) {
        if (bike.getState().equals("old")){
            System.out.println("旧自行车，不舒服");
        }else {
            bike.setState("new");
            bike.work(new NewBike());
        }
    }
}
