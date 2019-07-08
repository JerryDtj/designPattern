package version1;
/**
 * 简单工程模式，计算器
 *
 * @Author: jerry
 * @DATE: 2019/7/8 17:55
 **/
public interface OperationFactory {
    /**
     * 通过工场方法，生成指定的方法
     * @return
     */
    Operation createOperation();
}
