/**
 * @author Jerry
 * @Date 2019-07-24 07:51
 */
public class TeamLeader extends Manager {


    @Override
    void excuteTakeLeave(int days, String name, String reasion) {
        if (days<=3){
            System.out.println(String.format("%s,因为%s原因，想请假%s天，被%s批准",name,reasion,days,this.getClass().getName()));
        }else {
            System.out.println(String.format("%s无权处理请求上级",this.getClass().getName()));
            nextLevel.excuteTakeLeave(days,name,reasion);
        }
    }


}
