package org.william.strategy;

/**
 * Created by huawai on 2017/3/21.
 * Description:
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！ ");
    }
}
