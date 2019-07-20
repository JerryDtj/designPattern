package classAdapter;

/**
 * @author Jerry
 * @Date 2019-07-20 08:04
 */
public class ClassAdapterClient {

    public static void main(String[] args) {
        System.out.println("Iphone没电了");
        Usb usb = new TypeCAdapter();
        usb.usb();
    }
}
