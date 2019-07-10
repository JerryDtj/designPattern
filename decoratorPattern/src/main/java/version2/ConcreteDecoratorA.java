package version2;

/**
 * @author Jerry
 * @Date 2019-07-10 08:47
 */

public class ConcreteDecoratorA extends Decorator{
    private String addState;

    @Override
    public void operation(){
        System.out.println("this is ConcreteDecoratorA's operation");
        super.operation();

    }


}
