/**
 * @author Jerry
 * @Date 2019-07-26 08:55
 */
public class FlyWeightClient {
    public static void main(String[] args) {
        ChessmenFactory factory = new ChessmenFactory();
        Chessmen c1 = factory.getChessmen("black",0,1);
        Chessmen c2 = factory.getChessmen("black",0,2);
        System.out.println(c1==c2);
    }
}
