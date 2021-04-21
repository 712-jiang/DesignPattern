package proxy.V03;

import java.util.Random;

/**
 * @author 712
 * @function: 记录坦克移动的时间
 * 实现静态代理
 * 问题:如何时间各种代理功能的灵活组合？
 * 所有类都通过聚合，实现Moveable变量，因为他们都implements Moveable，所以就可以嵌套执行了~
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
        //实现Proxy的嵌套
        new tankLogProxy(
                new tankTimeProxy(
                        new Tank())).move();
    }
}

class tankTimeProxy implements Movable{
//    Tank tank = new Tank();
    Movable m;

    public tankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

class tankLogProxy implements Movable{
    Movable m;

    public tankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("The tank is moving ....");
        m.move();
        System.out.println("The tank is stopping ....");
    }
}

interface Movable{
    void move();
}