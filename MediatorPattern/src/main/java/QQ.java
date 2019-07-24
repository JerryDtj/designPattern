/**
 * @author Jerry
 * @Date 2019-07-25 07:19
 */
public class QQ implements Tencent {

    @Override
    public void getMsg(User from, String msg, User to) {
        to.getMsg(String.format("用户%s给您发了一条消息：%s",from,msg));
    }
}
