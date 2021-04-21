package spring.aop.v2;

import java.util.Random;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 16:17
 */
public class Ship{
    public void move() {
        System.out.println("Shap moving claclacla.....");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
