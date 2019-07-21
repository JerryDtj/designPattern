package version1;

/**
 * 懒汉（饱汉）模式
 *  采用双重锁定来保证线程安全
 *
 * @Author: jerry
 * @DATE: 2019/7/21 15:54
 **/
public class SingletonOne {
    private static volatile SingletonOne singletonOne;

    private SingletonOne(){}

    public static SingletonOne getInstance(){
        //第一层检查
        if (singletonOne == null){
            synchronized (SingletonOne.class){
                //第二层检查 为了防止多线程情况下有N个线程进入到这个入口
                if (singletonOne==null){
                    return new SingletonOne();
                }
            }
        }
        return singletonOne;
    }

}
