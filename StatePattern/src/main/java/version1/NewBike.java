package version1;

/**
 * @author Jerry
 * @Date 2019-07-18 08:42
 */
public class NewBike implements BikeState {

    @Override
    public void getStatue(Bike bike) {
        if (bike.getState().equals("new")){
            System.out.println("新自行车，骑起来很舒服");
        }else {
            bike.setState("old");
            bike.work(new OldBike());
        }
    }
}
