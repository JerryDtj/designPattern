/**
 * @author Jerry
 * @Date 2019-07-26 08:29
 */
public class BlackChessmen implements Chessmen {
    @Override
    public void colour() {
        System.out.println("黑色棋子");
    }

    @Override
    public void position(int x, int y) {
        System.out.println(String.format("黑棋下到了X：%S,Y:%s",x,y));
    }
}
