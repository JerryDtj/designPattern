package version1;

/**
 * 加法工场，实现了运算工场
 * 简单工场模式
 *
 * @Author: jerry
 * @DATE: 2019/7/8 18:00
 **/
public class OperationAddFactory implements OperationFactory {

    /**
     * 生产加法
     */
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
