package version2;

/**
 *
 * 装饰器A
 *
 * @author Jerry
 * @Date 2019-07-10 08:47
 */

public class ConcreteDecoratorA extends Decorator{

    @Override
    public void operation(){
        System.out.println("this is ConcreteDecoratorA's operation");
        super.operation();

    }


}
