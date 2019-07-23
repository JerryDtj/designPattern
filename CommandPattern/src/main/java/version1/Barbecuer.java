package version1;

/**
 * 命令模式——紧耦合
 *
 * @Author: jerry
 * @DATE: 2019/7/23 21:17
 **/
public class Barbecuer {
    public void BakeMutton(){
        System.out.println("烤羊肉串");
    }

    public void BakeChickenWing(){
        System.out.println("烤鸡腿");
    }

    public static void main(String[] args) {
        Barbecuer b = new Barbecuer();
        b.BakeChickenWing();
        b.BakeMutton();
    }

}
