package version1;

/**
 * 抽象工厂模式优化版本：用简单工厂模式代替原有的抽象工厂
 * 即用 一个简单工厂替换掉原来的AbstractProductAFactory，ConcreteProductAFactory,AbstractProductBFactory,ConcreteProductBFactory
 *
 * @author Jerry
 * @Date 2019-07-17 08:57
 */
public abstract class AbstractProductA {
    abstract void methodA1();
    abstract void methodA2();
}
