/**
 * @author Jerry
 * @Date 2019-07-24 08:09
 */
public class GeneralManager extends Manager {
    @Override
    void excuteTakeLeave(int days, String name, String reasion) {
        System.out.println(String.format("%s,因为%s原因，想请假%s天，被%s批准",name,reasion,days,this.getClass().getName()));
    }
}
