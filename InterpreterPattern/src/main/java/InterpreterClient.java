/**
 * @author Jerry
 * @Date 2019-07-28 10:39
 */
public class InterpreterClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.setMsg("abc%sabc%scc%add");
        String result = "";
        StringExpression stringExpression;
        if (context.getMsg().contains("%s")){
            stringExpression = new ReplaceString();
            stringExpression.setContext(context);
            context.setMsg(stringExpression.stringExpression());
        }
        if (context.getMsg().contains("%a")){
            stringExpression = new AddString();
            stringExpression.setContext(context);
            context.setMsg(stringExpression.stringExpression());
        }


        System.out.println(context.getMsg());


    }
}
