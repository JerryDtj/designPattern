/**
 *
 * 抽象被观察者
 *
 * @author Jerry
 * @Date 2019-07-12 19:22
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObs();


}
