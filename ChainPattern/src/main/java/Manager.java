/**
 * 请假
 *
 * @author Jerry
 * @Date 2019-07-24 07:35
 */
public abstract class Manager {
    protected Manager nextLevel;

    abstract void excuteTakeLeave(int days,String name,String reasion);

    /**
     * 设置上级
     * @param nextLevel
     */
    void setNext(Manager nextLevel){
        this.nextLevel = nextLevel;
    }
}
