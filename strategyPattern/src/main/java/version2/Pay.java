package version2;

/**
 * 需求如下：做一个商场收银软件，营业员根据客户所购买商品的单价和数量向客户收费
 * 增加需求：现在商场促销，增加打折选项
 * 再次增加需求：新增打折计算方式：满300减100
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
    private double rebate = 0L;

    private RebateCash(){

    }

    private RebateCash(double rebate){
        this.rebate = rebate;
    }

    public RebateCash setRebateCash(double rebate){
        return new RebateCash(rebate);
    }

    @Override
    public double payMoney(double pice) {
        return 0;
    }
}



