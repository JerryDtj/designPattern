/**
 * @author Jerry
 * @Date 2019-07-28 11:09
 */
public class AddString extends StringExpression{

    @Override
    String stringExpression() {
        if (param.contains("%a")){
            String[] params= param.split("%a");
            StringBuilder builder = new StringBuilder();
            for (int i=0;i<params.length;i++){
                if (i==0){
                    builder.append(params[i]);
                }else {
                    builder.append("_").append(params[i]);
                }
            }
            param = builder.toString();
        }

        return param;
    }
}
