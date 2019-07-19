/**
 * @author Jerry
 * @Date 2019-07-19 09:08
 */
public class AdapterClient {
    public static void main(String[] args) {
        Persion persion = new ChinaPersion();
        persion.speakChinese();

        ChineseAdapter chineseAdapter = new ChineseAdapter();
        chineseAdapter.setPersion(new EnglishPersion());
        chineseAdapter.speakChinese();

    }
}
