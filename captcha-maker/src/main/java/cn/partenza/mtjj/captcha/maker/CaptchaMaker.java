package cn.partenza.mtjj.captcha.maker;

import cn.partenza.mtjj.captcha.maker.bean.BaseConfig;
import cn.partenza.mtjj.captcha.maker.utils.Helper;

/**
 * @author jiuqing
 * @date 2019/10/21 6:55 下午
 */
public abstract class CaptchaMaker {

    protected Helper helper;
    protected BaseConfig config;


    protected CaptchaMaker(BaseConfig config) {
        this.helper = new Helper();
        this.config = config;
    }

    /**
     * 函数方法
     */
    public abstract void create();

}
