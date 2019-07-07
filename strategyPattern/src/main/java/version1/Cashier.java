package version1;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求如下：做一个商场收银软件，营业员根据客户所购买商品的单价和数量向客户收费
 * 增加需求：现在商场促销，增加打折选项
 *
 * 不想，拿到需求直接开撸版
 *
 * 优点：结构简单，清晰明了
 * 缺点：耦合度高，不易重构，一旦有新需求就要修改这个类
 *
 * 收银实体类
 *
 * @author Jerry
 * @Date 2019-07-03 22:51
 */
public class Cashier {
    public static void main(String[] args) {
        //模拟用户买了5件商品
        List<Goods> list = new ArrayList<Goods>(6);
        for (int i=1;i<5;i++){
            Goods goods = new Goods();
            goods.setId(i);
            goods.setName("商品价格"+i);
            goods.setPirce(i);
            goods.setRange(5);
            list.add(goods);
        }



        Cashier cashier = new Cashier();

        //开始付钱
        System.out.println("总共需要支付："+cashier.pay(list));
    }

    public double pay(List<Goods> goodsList){
        double pay = goodsList.stream().mapToDouble(g -> (g.pirce*0.1*g.range)).sum();
        return pay;
    }

}
