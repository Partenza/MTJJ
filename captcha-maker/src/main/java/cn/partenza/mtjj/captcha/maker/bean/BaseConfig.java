package cn.partenza.mtjj.captcha.maker.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.awt.*;

/**
 * @author jiuqing
 * @date 2019/10/21 7:07 下午
 */
@Data
@Accessors(chain = true)
public class BaseConfig {
    private int width;
    private int height;
    private int number;
    private String charSet;
    private Colors characterColor;
    /**
     * 随机颜色
     */
    private Colors bgColors;
    /**
     * 单一颜色
     */
    private Color bgColor;
    private Colors lineColor;
    /**
     * 干扰线数量
     */
    private int curveNum;
    /**
     * 干扰点数量
     */
    private int pointNum;
    private int[] lineNumRange;
    /**
     * 字体
     */
    private Font font;
    /**
     * 存储文件夹地址
     */
    private String savePath;
}
