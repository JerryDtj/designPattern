package version2;

/**
 * @author Jerry
 * @Date 2019-07-23 22:37
 */
public class BakeChickenWing implements UserMenu {
    @Override
    public void menu() {
        System.out.println("顾客点了菜单——烤鸡腿,通知厨师开始做");
        cook.BakeChickenWing();
    }
}
