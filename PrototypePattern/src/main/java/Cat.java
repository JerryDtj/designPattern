import lombok.Setter;

/**
 *
 * 原型模式
 *
 * @Author: jerry
 * @DATE: 2019/7/10 20:42
 **/
@Setter
public class Cat implements Cloneable {
    String name;

    public static void main(String[] args) {
        Cat man = new Cat();
        man.setName("张三");
        try {
            Cat man1 = (Cat) man.clone();
            System.out.println("我是man 的克隆，我也叫"+man1.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
