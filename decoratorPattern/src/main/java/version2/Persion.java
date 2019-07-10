package version2;

/**
 *
 * 装饰器模式：
 *
 * @author Jerry
 * @Date 2019-07-07 12:02
 */
public class Persion {
    String type;

    private Persion(String type){
        this.type = type;
    }

    public static Persion setType(String type){
        System.out.print(type+":");
        return new Persion(type);
    }
}
