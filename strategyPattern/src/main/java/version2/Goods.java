package version2;

import lombok.Data;

/**
 *
 * 需求如下：做一个商场收银软件，营业员根据客户所购买商品的单价和数量向客户收费
 * 增加需求：现在商场促销，增加打折选项
 * 再次增加需求：新增打折计算方式：满300减100
 *
 *
 * 简单工厂模式版
 *
 * 商品实体类
 *
 * @author Jerry
 * @Date 2019-07-03 22:09
 */
@Data
public class Goods {
   public int id;
   /**
    * 商品名称
    */
   public String name;
   /**
    * 商品价格
    */
   public double pirce;
   /**
    * 商品折扣:默认不打折
    */
   public Pay pay;
}
