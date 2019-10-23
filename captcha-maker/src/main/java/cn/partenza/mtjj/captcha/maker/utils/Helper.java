package cn.partenza.mtjj.captcha.maker.utils;

import cn.partenza.mtjj.captcha.maker.bean.Colors;

import java.awt.*;
import java.util.Random;

/**
 * @author jiuqing
 * @date 2019/10/23 7:00 下午
 */
public class Helper {

    private final Random random;


    public Helper() {
        random = new Random();
    }

    public Color randomColor() {
        return new Color(random.nextInt(256),
                random.nextInt(256), random.nextInt(256));
    }

    public Color randomColor(Colors colors) {
        return new Color(
                random.nextInt(colors.getR()[1] - colors.getR()[0]) + colors.getR()[0],
                random.nextInt(colors.getG()[1] - colors.getG()[0]) + colors.getG()[0],
                random.nextInt(colors.getB()[1] - colors.getB()[0]) + colors.getB()[0]
        );
    }
}
