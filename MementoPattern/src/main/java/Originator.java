import lombok.ToString;

/**
 * 大话设计模式——备忘录模式
 *
 * @author Jerry
 * @Date 2019-07-20 07:05
 */
@ToString
public class Originator {
    int state;
    String name;

    Memento createMemento() {
        return new Memento(state,name);
    }

    void setMemento(Memento memento){
        this.state = memento.getState();
        this.name = memento.getName();
    }
}
