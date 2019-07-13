package zhuangshi;

/**
 * @author Jerry
 * @Date 2019-07-13 20:10
 */
public class LightDecorator extends TreeDecorator {
    LightDecorator(ChristmasDay christmasDay) {
        super(christmasDay);
    }

    @Override
    public void buyChristmasTree() {
        super.buyChristmasTree();
        System.out.println("往圣诞树上安装圣诞灯");
    }
}
