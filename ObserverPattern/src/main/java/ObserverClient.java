/**
 * @author Jerry
 * @Date 2019-07-12 19:55
 */
public class ObserverClient {

    public static void main(String[] args) {

       WebChatServer webChatServer = new WebChatServer();

       Observer observer = new User();
       webChatServer.attach(observer);
       webChatServer.message="1";
       webChatServer.notifyObs();


    }
}
