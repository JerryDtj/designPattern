package version1;

/**
 * 加法运算类，实现了运算接口
 *
 * @Author: jerry
 * @DATE: 2019/7/8 19:34
 **/
public class AddOperation implements Operation {
    /**
     * 进行加法运算
     * @param num1 计算的数字1
     * @param num2 计算的数字2
     * @return 加完后的结果
     */
    @Override
    public double operation(double num1, double num2) {
        return num1+num2;
    }
}
