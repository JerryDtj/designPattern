package version2;

/**
 * 需求如下：做一个商场收银软件，营业员根据客户所购买商品的单价和数量向客户收费
 * 增加需求：现在商场促销，增加打折选项
 * 再次增加需求：新增打折计算方式：满300减100
 *
 * 优点：利用继承，多态，把所有的分支，转化成一个父类。具体的实现却在子类。对于调用者来说，只需要知道父类，和类型即可。耦合度减到了最低。
 *      如果配合工厂，只需要知道类型即可生成对应的之类。
 *
 *
 * 简单工厂模式版
 *
 * 收银实体类
 *
 * @author Jerry
 * @Date 2019-07-03 22:51
 */
public abstract class Pay{
    /**
     * 打几折
     */
    double rebate = 0;
    /**
     * 满300 返 100
     */
    double cash = 0;
    double returnCash = 0;

    /**
     * 打折计算抽象类
     * @param pice
     * @return
     */
    public abstract double payMoney(double pice);
}

/**
 * 正常计算，不打折
 */
class NormalCash extends Pay{

    @Override
    public double payMoney(double pice) {
        return pice;
    }
}

/**
 * 打折计算
 */
class RebateCash extends Pay{

    private RebateCash(){

    }

    private RebateCash(double rebate){
        this.rebate = rebate;
    }

    /**
     * 设置打折力度
     * @param rebate 打几折
     * @return
     */
    public static RebateCash setRebateCash(double rebate){

        return new RebateCash(rebate*0.1);
    }

    @Override
    public double payMoney(double pice) {
        return pice*rebate;
    }
}

/**
 * 满300返100
 */
class ReturnCash extends Pay{

    private ReturnCash(){}

    private ReturnCash(double cash,double returnCash){
        this.cash = cash;
        this.returnCash = returnCash;
    }

    public static ReturnCash setCashAndReturn(double cash,double returnCash){
       return new ReturnCash(cash,returnCash);
    }

    @Override
    public double payMoney(double pice) {
        return pice - pice/cash*returnCash;
    }
}



