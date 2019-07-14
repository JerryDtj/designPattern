package proxy.pattern;

/**
 * @author Jerry
 * @Date 2019-07-14 08:55
 */
public class ProxyClient {
    public static void main(String[] args) {
        Thesis thesis = new ThesisProxy(new Writer());
        thesis.writing();
    }
}
