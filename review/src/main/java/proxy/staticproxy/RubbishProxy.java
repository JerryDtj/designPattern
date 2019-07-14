package proxy.staticproxy;

/**
 * @author Jerry
 * @Date 2019-07-14 21:47
 */
public class RubbishProxy implements Rubbish {
    private Rubbish rubbish;

    RubbishProxy(Rubbish rubbish){
        this.rubbish = rubbish;
    }

    public void drop() {
        rubbish.drop();
    }
}
