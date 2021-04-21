package proxy.V01;

import java.util.Random;

/**
 * @author 712
 * @function:  记录坦克移动的时间
 * @create 2021/4/14 11:40
 */
public class Tank implements Movable{
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Tank moving claclacla.....");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable{
    void move();
}