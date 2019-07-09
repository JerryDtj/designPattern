package version2;

/**
 * despaction
 *
 * @Author: jerry
 * @DATE: 2019/7/8 16:30
 **/
public class Proxy extends Subject {

    RealSubject realSubject = new RealSubject();

    @Override
    public void Request() {
        System.out.println("do Something");
        realSubject.Request();
    }
}
