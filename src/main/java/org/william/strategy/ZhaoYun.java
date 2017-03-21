package org.william.strategy;


/**
 * Created by huawai on 2017/3/21.
 * Description:
 */
public class ZhaoYun {

    public static void main(String[] args) {
        StrategyContainer container;
        container = new StrategyContainer(new BackDoorStrategy());
        container.operate();
        System.out.println("----------------");

        container = new StrategyContainer(new GivenGreenLight());
        container.operate();

        System.out.println("-----------------");

        container = new StrategyContainer(new BlockEnemy());
        container.operate();
    }
}
