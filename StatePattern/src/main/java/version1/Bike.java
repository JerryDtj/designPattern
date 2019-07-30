package version1;

/**
 * @author Jerry
 * @Date 2019-07-18 08:40
 */
public class Bike {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void work(BikeState bikeState){



        bikeState.getStatue(this);
    }
}
