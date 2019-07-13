package zhuangshi;

/**
 * @author Jerry
 * @Date 2019-07-13 20:12
 */
public class DecoratorClient {
    public static void main(String[] args) {
        ChristmasDay christmasDay = new ChristmasDayBefore();
        christmasDay = new StarsDecorator(christmasDay);
        TreeDecorator treeDecorator = new LightDecorator(christmasDay);
        treeDecorator.buyChristmasTree();
    }
}
