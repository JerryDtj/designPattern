package version2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry
 * @Date 2019-07-04 07:17
 */
public class PayFactory {
    public static Pay creatPay(double rebate,double cash,double returnCash){
        Pay pay;
        if (rebate!=0){
            pay = RebateCash.setRebateCash(rebate);
        }else if(cash!=0&&returnCash!=0){
            pay = ReturnCash.setCashAndReturn(cash,returnCash);
        }else {
            pay = new NormalCash();
        }
        return pay;
    }

    public static void main(String[] args) {
        //模拟用户买了5件商品
        List<Goods> list = new ArrayList<Goods>(6);
        for (int i=1;i<5;i++){
            Goods goods = new Goods();
            goods.setId(i);
            goods.setName("商品价格"+i);
            goods.setPirce(i);

            if (i==1){
                goods.setPay(PayFactory.creatPay(0,0,0));
            }else if (i%2==0){
                goods.setPay(PayFactory.creatPay(8,0,0));
            }else {
                goods.setPay(PayFactory.creatPay(0,3,1));
            }
            list.add(goods);
        }

        System.out.println(list);
        double sum = list.stream().mapToDouble(goods -> goods.getPay().payMoney(goods.pirce)).sum();
        System.out.println("您总共需要支付："+sum);
    }
}
