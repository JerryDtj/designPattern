/**
 * 模版方法
 *
 * @Author: jerry
 * @DATE: 2019/7/10 21:22
 **/
public abstract class Kaoshi {

    public final void start(){
        System.out.println("开始考试");
        fajuanzi();
        answer();
    }

    public void fajuanzi(){
        System.out.println("监考老师开始发试卷");
    }

    public abstract void answer();
}
