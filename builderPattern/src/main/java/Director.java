/**
 * @author Jerry
 * @Date 2019-07-12 10:34
 */
public class Director {

    public void createReboot(RebootBuild rebootBuild){
        rebootBuild.buidHeard();
        rebootBuild.buildBody();
        rebootBuild.buildLeftArm();
        rebootBuild.buildrightArm();
        rebootBuild.buildLeftLeg();
        rebootBuild.buildrightLeg();
    }

    public static void main(String[] args) {
        RebootBuild rebootBuild = new ManRebootBuild();
        Director director = new Director();
        director.createReboot(rebootBuild);
    }
}
