package org.william.proxy;

/**
 * Created by huawai on 2017/4/12.
 * Description:代理类
 */
public class WangPo implements IKindWomen {
    private IKindWomen kindWomen;

    //默认的话，是潘金莲的代理
    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    //她可以是KindWomen的任何一个女人的代理，只要你是这一类型
    public WangPo(IKindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
