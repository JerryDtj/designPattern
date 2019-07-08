package version1;
/**
 * 简单工场模式，计算器工场
 *
 * @Author: jerry
 * @DATE: 2019/7/8 17:55
 **/
public interface OperationFactory {
    /**
     * 运算工场，产生各种运算的工场
     * @return
     */
    Operation createOperation();
}
