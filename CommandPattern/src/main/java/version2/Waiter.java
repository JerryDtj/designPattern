package version2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry
 * @Date 2019-07-23 22:40
 */
public class Waiter {
    private List<UserMenu> orders = new ArrayList<>();

    void addOrder(UserMenu menu){
        orders.add(menu);
    }

    void removeOrder(UserMenu menu){
        orders.remove(menu);
    }

    void Notify(){
        orders.forEach(o -> o.menu());
    }

}
