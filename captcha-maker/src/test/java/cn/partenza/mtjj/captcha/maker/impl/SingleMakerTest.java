package cn.partenza.mtjj.captcha.maker.impl;

import cn.partenza.mtjj.captcha.maker.bean.BaseConfig;
import cn.partenza.mtjj.captcha.maker.bean.Colors;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * @author jiuqing
 * @date 2019/10/23 11:20 下午
 */
public class SingleMakerTest {

    @Test
    public void create() {
        String charSet = "0123456789";
        BaseConfig config = new BaseConfig()
                .setHeight(70)
                .setWidth(200)
                .setCharSet(charSet)
                .setNumber(4)
                .setCurveNum(5)
                .setPointNum(20)
                .setBgColor(Color.WHITE)
                .setCharacterColor(new Colors(100, 120, 100, 120, 100, 120))
                .setFont(new Font("微软雅黑", Font.BOLD, 50))
                .setSavePath("");
        SingleMaker sm = new SingleMaker(config);
        sm.create();
    }
}