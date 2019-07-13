package zhuangshi;

/**
 *
 * 圣诞节装饰器
 *
 * @author Jerry
 * @Date 2019-07-13 19:45
 */
public class TreeDecorator implements ChristmasDay {
    private ChristmasDay christmasDay;

    TreeDecorator(ChristmasDay christmasDay){
        this.christmasDay = christmasDay;
    }


    public void buyChristmasTree() {
        christmasDay.buyChristmasTree();
    }
}
