/**
 * @author Jerry
 * @Date 2019-07-25 07:17
 */
public class PersionTwo implements User {
    private Tencent t;

    void setTencent(Tencent t){
        this.t = t;
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(String.format("用户%s发了一条消息：%s",this,msg));
        t.getMsg(this,msg,new PersonOne());
    }

    @Override
    public void getMsg(String msg) {
        System.out.println(String.format("用户%s您好，您收到一条消息",this));
        System.out.println(msg);
    }
}
