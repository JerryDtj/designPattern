package version2;

/**
 * @author Jerry
 * @Date 2019-07-10 09:05
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        Decorator decorator = new ConcreteDecoratorA();
        decorator.setComponent(concreteComponent);
        decorator.operation();
    }


}
