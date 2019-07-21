/**
 * @author Jerry
 * @Date 2019-07-21 08:18
 */
public class Left extends Component {
    Left(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        System.out.println("左节点不能添加");
    }

    @Override
    void remove(Component c) {
        System.out.println("左节点不能删除");
    }

    @Override
    void show() {
        System.out.println(super.name);
    }
}
