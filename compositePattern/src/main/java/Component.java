/**
 * @author Jerry
 * @Date 2019-07-21 08:17
 */
public abstract class Component {
    protected String name;
    Component(String name){
        this.name = name;
    }
    abstract void add(Component c);
    abstract void remove(Component c);
    abstract void show();
}
