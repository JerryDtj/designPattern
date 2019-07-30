package version2;

/**
 * @author Jerry
 * @Date 2019-07-30 09:03
 */
public class Bike {
    private String state;

    private State bikeState;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    void work(){
        switch (this.state){
            case "new":
                bikeState = new NewBike();
                bikeState.getState(this);
                break;
            case "old":
                bikeState = new OldBike();
                bikeState.getState(this);
        }
    }
}
