package org.william.strategy;

/**
 * Created by huawai on 2017/3/21.
 * Description:策略容器
 */
public class StrategyContainer {

    private IStrategy strategy;

    public StrategyContainer(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }

}
