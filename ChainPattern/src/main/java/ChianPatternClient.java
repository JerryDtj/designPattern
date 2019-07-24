/**
 * @author Jerry
 * @Date 2019-07-24 08:10
 */
public class ChianPatternClient {
    public static void main(String[] args) {

        GeneralManager generalManager = new GeneralManager();
        Majordomo majordomo = new Majordomo();
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.setNext(majordomo);
        majordomo.setNext(generalManager);


        teamLeader.excuteTakeLeave(10,"张三","旅游");
        teamLeader.excuteTakeLeave(5,"李四","旅游");
        teamLeader.excuteTakeLeave(2,"王五","有事情");

    }
}
