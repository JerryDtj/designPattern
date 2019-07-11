/**
 * 模版方法模式
 *
 * @Author: jerry
 * @DATE: 2019/7/11 16:35
 **/
public class Start {
    public static void main(String[] args) {
        Kaoshi kaoshi = new StudentA();
        kaoshi.start();

        Kaoshi kaoshiB = new StudentB();
        kaoshiB.start();
    }
}
