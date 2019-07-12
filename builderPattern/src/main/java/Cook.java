/**
 *
 * 外观模式
 *
 * @author Jerry
 * @Date 2019-07-11 21:59
 */
public class Cook {
    public static void start(){
        System.out.println("准备做饭");
        Xicai.start();
        Zhumi.start();
    }

    public static void main(String[] args) {
        Cook.start();
    }

}

class Xicai{
    public static void start(){
        System.out.println("开始洗菜");
    }
}

class Zhumi{
    public static void start(){
        System.out.println("开始煮米饭");
    }
}
