/**
 * @author Jerry
 * @Date 2019-07-21 08:26
 */
public class CompositeClient {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Left("child A"));
        root.add(new Left("child B"));

        Composite rootChildA = new Composite("rootChildA");
        rootChildA.add(new Left("child A1"));
        rootChildA.add(new Left("child B1"));

        root.add(rootChildA);

        root.show();
    }


}
