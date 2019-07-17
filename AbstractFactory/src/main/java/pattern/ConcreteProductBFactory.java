package pattern;

/**
 * @author Jerry
 * @Date 2019-07-17 08:03
 */
public class ConcreteProductBFactory extends AbstractProductBFactory {
    private  AbstractProductB productB;

    @Override
    AbstractProductB createProductB(String type) {
        switch (type){
            case "productB1":
                productB = new ProductB1();
                break;
            case "productB2":
                productB = new ProductB2();
                break;
            default:
                System.out.println("类型错误");

        }
        return productB;
    }
}
