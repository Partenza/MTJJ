package cn.partenza.mtjj.captcha.maker.impl;

import cn.partenza.mtjj.captcha.maker.CaptchaMaker;
import cn.partenza.mtjj.captcha.maker.bean.BaseConfig;
import cn.partenza.mtjj.captcha.maker.bean.Colors;
import cn.partenza.mtjj.captcha.maker.utils.FIOUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author jiuqing
 * @date 2019/10/21 7:04 下午
 */
public class SingleMaker extends CaptchaMaker {

    SingleMaker(BaseConfig config) {
        super(config);
    }

    @Override
    public void create() {
        BufferedImage verifyImg = new BufferedImage(config.getWidth(), config.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) verifyImg.getGraphics();
        // 设置画笔颜色-验证码背景色
        graphics.setColor(config.getBgColor());
        //填充背景
        graphics.fillRect(0, 0, config.getWidth(), config.getHeight());
        graphics.setFont(config.getFont());
        String baseNumLetter = config.getCharSet();
        StringBuffer sBuffer = new StringBuffer();
        //旋转原点的 x 坐标
        int x = 10;
        String ch = "";
        Random random = new Random();

        for (int i = 0; i < config.getNumber(); i++) {
            graphics.setColor(this.helper.randomColor());
            //设置字体旋转角度
            //角度小于30度
            int degree = random.nextInt() % 30;
            int dot = random.nextInt(baseNumLetter.length());
            ch = baseNumLetter.charAt(dot) + "";
            sBuffer.append(ch);
            //正向旋转
            graphics.rotate(degree * Math.PI / 180, x, 45);
            graphics.drawString(ch, x, 45);
            //反向旋转
            graphics.rotate(-degree * Math.PI / 180, x, 45);
            x += 48;

        }

        //画干扰线

        for (int i = 0; i < config.getCurveNum(); i++) {
            // 设置随机颜色
            graphics.setColor(this.helper.randomColor());
            // 随机画线
            graphics.drawLine(random.nextInt(config.getWidth()), random.nextInt(config.getHeight()),
                    random.nextInt(config.getWidth()), random.nextInt(config.getHeight()));
        }

        //添加噪点

        for (int i = 0; i < config.getPointNum(); i++) {
            int x1 = random.nextInt(config.getWidth());
            int y1 = random.nextInt(config.getHeight());
            graphics.setColor(this.helper.randomColor());
            graphics.fillRect(x1, y1, 2, 2);
        }
        try {
            FIOUtils.saveFile(String.format("%s_%s.png", sBuffer.toString(), String.valueOf(System.currentTimeMillis())), verifyImg);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
