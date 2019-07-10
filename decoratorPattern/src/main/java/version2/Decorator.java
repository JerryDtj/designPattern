package version2;

import lombok.Setter;

/**
 * @author Jerry
 * @Date 2019-07-10 07:37
 */
@Setter
public class Decorator implements Component  {
    Component component;

    @Override
    public void operation() {
        System.out.println("this is Decorator");
        component.operation();
    }
}
