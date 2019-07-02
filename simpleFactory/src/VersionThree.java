import java.util.Scanner;

/**
 * 要求用面向对象的语言实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。
 *
 * 简单工厂模式：简单工厂篇
 *
 * 优点：利用类的继承，多态和封装，以及简单的工厂模式彻底的解耦代码，即使需求再次变更，也不会导致整个运算类重构，只需要修改/添加涉及到的部分代码即可
 * 缺点：因为利用了面向对象的特征，所以代码较多，可阅读性较versionOne差。
 *
 * @author Jerry
 * @Date 2019-07-02 23:33
 */
public class VersionThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("亲输入数字A:");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("亲输入数字B:");
        int num2 = Integer.valueOf(scan.nextLine());
        System.out.println("请选择运算符号(+ - * /):");
        String operate = scan.nextLine();

        Operation operation = OperationFactory.crteateOperation(operate);
        operation.setNum1(num1);
        operation.setNum2(num2);
        int result = operation.operate();
        System.out.println("计算结果："+result);
    }

    public static abstract class Operation{
        private int num1;
        private int num2;

        /**
         * 开始计算方法
         * @return 运算结果
         */
        public abstract int operate();


        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public int getNum2() {
            return num2;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }
    }

    public static class AddOperation extends Operation{

        @Override
        public int operate() {
            return super.num1+super.num2;
        }
    }

    public static class SubOperation extends Operation{
        @Override
        public int operate() {
            return super.num1-super.num2;
        }
    }

    public static class MulOperation extends Operation{
        @Override
        public int operate() {
            return super.num1*super.num2;
        }
    }

    public static class DivOperation extends Operation{

        @Override
        public int operate() {
            if (super.num2==0){
                throw new RuntimeException("除数不能为0");
            }
            return super.num1/super.num2;
        }
    }

    public static class OperationFactory{
        public static Operation crteateOperation(String operate){
            Operation operation  = null;
            switch (operate){
                case "+":
                    operation = new AddOperation();
                    break;
                case  "-":
                    operation = new SubOperation();
                    break;
                case "*":
                    operation = new MulOperation();
                    break;
                case "/":
                    operation = new DivOperation();
                    break;
                default:
                    System.out.println("运算符号不正确");
                    break;
            }
            return operation;
        }
    }

}

