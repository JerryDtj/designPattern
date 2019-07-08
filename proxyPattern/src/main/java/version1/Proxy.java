package version1;

import lombok.Data;

/**
 * 我理解的代理模式
 *
 * @Author: jerry
 * @DATE: 2019/7/8 15:59
 **/
@Data
public class Proxy {
    String name;
    public void giveLiwu(Girl girl){
        NiceBoy niceBoy = new NiceBoy();
        niceBoy.setName(this.name);
        System.out.println(String.format("%s,叫我给你一份礼物：",name));
        niceBoy.giceLiwu(girl);
    }

    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("nice");

        Proxy proxy = new Proxy();
        proxy.setName("张三");
        proxy.giveLiwu(girl);
    }
}
