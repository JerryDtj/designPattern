/**
 * @author Jerry
 * @Date 2019-07-19 09:05
 */
public class ChineseAdapter implements Persion{
    private Persion persion;

    public void setPersion(Persion persion) {
        this.persion = persion;
    }

    @Override
    public void speakChinese() {
        System.out.println("开始翻译成中文");
        persion.speakChinese();
    }
}
