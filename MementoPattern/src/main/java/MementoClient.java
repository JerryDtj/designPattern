/**
 * @author Jerry
 * @Date 2019-07-20 07:14
 */
public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.state = 0;
        originator.name="aa";

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.state = 1;
        originator.name="bbb";
        System.out.println("错误数据："+originator.toString());
        originator.setMemento(caretaker.getMemento());
        System.out.println("数据已经恢复，恢复数据为："+originator.toString());





    }
}
