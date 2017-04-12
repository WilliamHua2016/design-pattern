package org.william.proxy;

/**
 * Created by huawai on 2017/4/12.
 * Description:被代理类
 */
public class PanJinLian implements IKindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲在和男人做那个.....");
    }
}
