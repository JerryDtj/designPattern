package version2;

/**
 * 装饰器模式客户端调用
 *
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
