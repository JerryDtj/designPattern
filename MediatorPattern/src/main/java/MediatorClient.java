/**
 * 中介模式：通过模拟用户在腾讯聊天平台上和其他的用户聊天来实现
 *
 * @author Jerry
 * @Date 2019-07-25 07:24
 */
public class MediatorClient {
    public static void main(String[] args) {
        PersonOne personOne = new PersonOne();
        personOne.setTencent(new QQ());
        personOne.sendMsg("my name is PersionOne,this is my msg");
    }
}
