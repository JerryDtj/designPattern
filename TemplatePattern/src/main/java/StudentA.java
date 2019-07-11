/**
 * 模版方法模式
 *
 * @Author: jerry
 * @DATE: 2019/7/11 16:34
 **/
public class StudentA extends Kaoshi {
    @Override
    public void answer() {
        System.out.println("studentA 的答案为 A");
    }
}

class StudentB extends Kaoshi {
    @Override
    public void answer() {
        System.out.println("studentB 的答案为 B");
    }
}
