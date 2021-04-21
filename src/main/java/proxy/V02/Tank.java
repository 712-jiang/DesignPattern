package proxy.V02;

import java.util.Random;

/**
 * @author 712
 * @function: 记录坦克移动的时间
 * 问题1：如果move()功能对外不透明，怎么记录移动时间？----使用聚合，在代理类中调用对象的move()
 * 问题2：只能代理时间吗？----创建别的代理
 * @create 2021/4/14 11:40
 */
public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank moving claclacla.....");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new tankTimeProxy(new Tank()).move();
        new tankLogProxy(new Tank()).move();
    }
}

class tankTimeProxy implements Movable{
//    Tank tank = new Tank();
    Tank tank;

    public tankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

class tankLogProxy implements Movable{
    Tank tank;

    public tankLogProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("The tank is moving ....");
        tank.move();
        System.out.println("The tank is stopping ....");
    }
}

interface Movable{
    void move();
}