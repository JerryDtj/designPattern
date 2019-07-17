package pattern;

/**
 * @author Jerry
 * @Date 2019-07-17 07:41
 */
public class AbstractClient {
    public static void main(String[] args) {
        AbstractProductAFactory productAFactory = new ConcreteProductAFactory();
        AbstractProductA productA = productAFactory.createProductA("productA1");
        productA.methodA1();
    }
}
