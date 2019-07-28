/**
 * @author Jerry
 * @Date 2019-07-28 10:27
 */
public abstract class StringExpression {
    protected String param;

    public void setContext(Context context) {
        this.param = context.getMsg();
    }

     abstract String stringExpression();


}
