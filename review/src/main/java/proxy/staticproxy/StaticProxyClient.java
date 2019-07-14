package proxy.staticproxy;

/**
 * @author Jerry
 * @Date 2019-07-14 21:50
 */
public class StaticProxyClient {
    public static void main(String[] args) {
        RubbishProxy proxy = new RubbishProxy(new Persion());
        proxy.drop();
    }
}
