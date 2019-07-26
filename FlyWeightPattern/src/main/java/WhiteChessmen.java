/**
 * @author Jerry
 * @Date 2019-07-26 08:30
 */
public class WhiteChessmen implements Chessmen {
    @Override
    public void colour() {
        System.out.println("白色棋子");
    }

    @Override
    public void position(int x, int y) {
        System.out.println(String.format("白棋棋下到了X：%s,Y:%s"));
    }
}
