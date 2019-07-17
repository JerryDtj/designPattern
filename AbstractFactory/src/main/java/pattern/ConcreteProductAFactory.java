package pattern;

/**
 * @author Jerry
 * @Date 2019-07-17 08:03
 */
public class ConcreteProductAFactory extends AbstractProductAFactory {
    private  AbstractProductA productA;

    @Override
    AbstractProductA createProductA(String type) {
        switch (type){
            case "productA1":
                productA = new ProductA1();
                break;
            case "productA2":
                productA = new ProductA2();
                break;
            default:
                System.out.println("类型错误");

        }
        return productA;
    }
}
