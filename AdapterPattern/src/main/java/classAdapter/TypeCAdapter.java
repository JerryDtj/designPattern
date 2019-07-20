package classAdapter;

/**
 * @author Jerry
 * @Date 2019-07-20 07:57
 */
public class TypeCAdapter extends Iphone implements Usb{
    @Override
    public void usb() {
        System.out.println("把typec转换成usb,开始给iphone充电");
        typeC();
    }
}
