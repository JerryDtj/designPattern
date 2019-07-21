package version3;

/**
 * 懒汉模式
 *    静态内部类
 *
 * @author Jerry
 * @Date 2019-07-21 21:43
 */
public class SingletonThree {


    private static class SingletonFactory{
        private static SingletonThree singletonThree = new SingletonThree();
    }

    private SingletonThree(){
        if(SingletonFactory.singletonThree != null){
            throw new IllegalStateException();
        }
    }

    public static SingletonThree getInstance(){
        return SingletonFactory.singletonThree;
    }

}

