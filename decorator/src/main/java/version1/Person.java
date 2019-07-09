package version1;


import lombok.Data;

/**
 *
 * 穿衣打扮：给不同类型的人穿不同的衣服。
 *
 * @author Jerry
 * @Date 2019-07-07 11:29
 */
@Data
public class Person {
    String type;

    private Person(String type){
        this.type = type;
    }

    public static Person setType(String type){
        System.out.print(type+":");
        return new Person(type);
    }

    public void WearTShirts(){
        System.out.print(" 大T恤");
    }

    public void WearBigTrouser(){
        System.out.print(" 垮裤");
    }

    public void WearSneakers(){
        System.out.print(" 破球鞋");
    }

    public void WearSuit(){
        System.out.print(" 西装");
    }

    public void WearTie(){
        System.out.print(" 领带");
    }

    public void WearLeatherAhoes(){
        System.out.print(" 皮鞋");
    }

    public static void main(String[] args) {
        Person p1 = Person.setType("白领");
        p1.WearSuit();
        p1.WearTie();
        p1.WearLeatherAhoes();
        System.out.println();
        Person p2 = Person.setType("小P孩");
        p2.WearTShirts();
        p2.WearBigTrouser();
        p2.WearSneakers();
    }

}
