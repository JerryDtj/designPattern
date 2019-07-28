/**
 * @author Jerry
 * @Date 2019-07-28 10:30
 */
public class ReplaceString extends StringExpression {
    @Override
    public String stringExpression() {
        if (param.contains("%s")){
            String[] params= param.split("%s");
            StringBuilder builder = new StringBuilder();
            for (int i=0;i<params.length;i++){
                if (i==0){
                    builder.append(params[i]);
                }else {
                    builder.append("*").append(params[i]);
                }
            }


            param = builder.toString();
        }
        return param;
    }
}
