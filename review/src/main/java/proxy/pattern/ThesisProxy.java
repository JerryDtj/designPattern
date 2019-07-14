package proxy.pattern;

/**
 * @author Jerry
 * @Date 2019-07-14 08:52
 */
public class ThesisProxy implements Thesis {

    private Thesis thesis;

    ThesisProxy(Thesis thesis){
        this.thesis = thesis;
    }

    public void writing() {
        System.out.println("花钱请别人写论文呢");
        thesis.writing();
        System.out.println("这是proxy写的论文");
    }
}
