package version1;

/**
 * 简单的策略模式，计算接口
 *
 * @Author: jerry
 * @DATE: 2019/7/8 19:21
 **/
public interface Operation {
    /**
     * 计算方法
     * @param num1 计算的数字1
     * @param num2 计算的数字2
     * @return 计算后的结果
     */
    double operation(double num1,double num2);
}
