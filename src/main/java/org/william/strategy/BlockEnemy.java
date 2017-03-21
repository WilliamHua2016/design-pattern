package org.william.strategy;

/**
 * Created by huawai on 2017/3/21.
 * Description:
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
