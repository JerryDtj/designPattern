/**
 * @author Jerry
 * @Date 2019-07-28 10:39
 */
public class InterpreterClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.setMsg("abc%sabc%scc%sdd");
        StringExpression stringExpression = new ReplaceString();
        stringExpression.setContext(context);
        System.out.println(stringExpression.stringExpression());
    }
}
