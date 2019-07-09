package version1;

/**
 * 简单工场模式客户端
 *
 * @Author: jerry
 * @DATE: 2019/7/8 19:44
 **/
public class Client {
    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationAddFactory();
        Operation operation = operationFactory.createOperation();
        double result = operation.operation(1,2);
        System.out.println(result);
    }
}
