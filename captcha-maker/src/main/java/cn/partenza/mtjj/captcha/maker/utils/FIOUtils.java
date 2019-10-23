package cn.partenza.mtjj.captcha.maker.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author jiuqing
 * @date 2019/10/21 7:21 下午
 */
public class FIOUtils {

    public static void saveFile(String fileName, BufferedImage bi) throws IOException {
        File file = new File(fileName);
        ImageIO.write(bi, "png", file);
    }

}
