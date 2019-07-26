/**
 * @author Jerry
 * @Date 2019-07-26 08:40
 */
public class ChessmenFactory {
    private static Chessmen chessmen;

    public Chessmen getChessmen(String name,int x,int y){
        if (chessmen == null){
            switch (name){
                case "black":
                    chessmen = new BlackChessmen();
                    break;
                case "white":
                    chessmen = new WhiteChessmen();
            }
        }
        chessmen.position(x,y);
        return chessmen;
    }

}
