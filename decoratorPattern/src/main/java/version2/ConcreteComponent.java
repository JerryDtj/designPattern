package version2;

/**
 * 真实实现类
 *
 * @author Jerry
 * @Date 2019-07-10 07:30
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println(" this is ConcreteComponent's operation() ");
    }
}
