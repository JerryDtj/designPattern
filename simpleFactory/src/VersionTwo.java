import java.util.Scanner;

/**
 *  要求用面向对象的语言实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。
 *
 *  简单工厂模式：封装篇
 *
 *  利用类的封装,达到初步解耦
 *
 *  优点：计算和输入初步解耦，但是如果需要新增算法，还是需要改动算法类
 *  缺点：耦合度太高，可维护性差。只要需求变动，就会更改这个类。如果一不小心改错了，所有的计算都会挂掉
 *
 * @author Jerry
 * @Date 2019-07-02 08:52
 */
public class VersionTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("亲输入数字A:");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("亲输入数字B:");
        int num2 = Integer.valueOf(scan.nextLine());
        System.out.println("请选择运算符号(+ - * /)");
        String operate = scan.nextLine();
        int result = operatation(num1,num2,operate);
        System.out.println("计算结果："+result);
    }

    public static int operatation(int num1,int num2,String operate){
        int result = 0;
        //开始计算
        switch (operate){
            case "+":
                result = num1 + num2;
                break;
            case  "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 /num2;
                break;
            default:
                System.out.println("运算符号不正确");
                break;
        }
        return result;
    }
}
