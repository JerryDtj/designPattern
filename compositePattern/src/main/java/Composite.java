import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry
 * @Date 2019-07-21 08:24
 */
public class Composite extends Component {

    private List<Component> list = new ArrayList<>();

    Composite(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        list.add(c);
    }

    @Override
    void remove(Component c) {
        list.remove(c);
    }

    @Override
    void show() {
        System.out.println(name);
        list.forEach(Component::show);
    }


}
