package org.william.proxy;

/**
 * Created by huawai on 2017/4/12.
 * Description:测试类
 */
public class XiMenQingTest {

    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        wangPo = new WangPo(new JiaShi());
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
    }
}
