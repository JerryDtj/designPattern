package version1;

import lombok.Data;

/**
 * despaction
 *
 * @Author: jerry
 * @DATE: 2019/7/8 15:55
 **/
@Data
public class NiceBoy {
    String name;

    public void giceLiwu(Girl girl){
        System.out.println(this.name+"给"+girl.name+" 送礼物");
    }
}
