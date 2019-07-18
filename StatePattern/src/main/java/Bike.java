/**
 * @author Jerry
 * @Date 2019-07-18 08:40
 */
public class Bike {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void state(){
        state.bikeState();
    }
}
