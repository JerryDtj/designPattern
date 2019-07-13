package zhuangshi;

/**
 *
 * 往圣诞树上装星星
 *
 * @author Jerry
 * @Date 2019-07-13 20:03
 */
public class StarsDecorator extends TreeDecorator {
    StarsDecorator(ChristmasDay christmasDay) {
        super(christmasDay);
    }

    @Override
    public void buyChristmasTree(){
        super.buyChristmasTree();
        System.out.println("往圣诞树上安装小星星");
    }

}
