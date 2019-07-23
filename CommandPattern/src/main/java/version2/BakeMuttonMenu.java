package version2;

/**
 * @author Jerry
 * @Date 2019-07-23 22:36
 */
public class BakeMuttonMenu implements UserMenu {
    @Override
    public void menu() {
        System.out.println("顾客点了烤羊肉串,通知厨师开始做");
        cook.BakeMutton();
    }
}
