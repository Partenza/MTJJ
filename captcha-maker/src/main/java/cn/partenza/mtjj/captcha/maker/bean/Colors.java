package cn.partenza.mtjj.captcha.maker.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jiuqing
 * @date 2019/10/23 5:54 下午
 */
@Data
@Accessors(chain = true)
public class Colors {
    private int[] r;
    private int[] g;
    private int[] b;

    public Colors(int rStart, int rEnd, int gStart, int gEnd, int bStart, int bEnd) {
        this.r = new int[]{rStart, rEnd};
        this.g = new int[]{gStart, gEnd};
        this.b = new int[]{bStart, bEnd};
    }

    public Colors(int r, int g, int b) {
        new Colors(r, r, g, g, b, b);
    }
}
