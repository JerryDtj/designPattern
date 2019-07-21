package version2;

/**
 * 饥汉模式
 *
 * @Author: jerry
 * @DATE: 2019/7/21 15:54
 **/
public class SingletonTwo {
    private SingletonTwo singletonTwo = new SingletonTwo();

    private SingletonTwo(){}

    public SingletonTwo getInstance(){
        return singletonTwo;
    }

}
