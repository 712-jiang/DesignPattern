package proxy.V04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @author 712
 * @function: 记录坦克移动的时间
 * 实现动态代理
 * 问题:Proxy不仅可以代理Moveable类型的对象，还可以代理其他任何类型的对象 Object。
 * 实际需求：记录时间、记录日志等，很多对象都需要这样的代理功能，一种对象实现一种Proxy太不合理
 * 解决方法：使用jdk的动态代理
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
        Tank tank = new Tank();
        //保存.class文件-看jdk底层调用情况
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //reflection 根据.class文件 二进制字节码分析类的属性和方法
        //newProxyInstance:所有参数
        //ClassLoader loader:获取类加载器，与 被代理类 相同的 类加载器--类加载器：通过一个类的全限定名来获取描述该类的二进制字节流
        //Class<?>[] interfaces:被代理对象应该实现哪些接口-->如果类没有实现任何接口，无法使用Proxy!
        //InvocationHandler h
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHander(tank) //写外部类实现
        );
        m.move();
    }
}
class LogHander implements InvocationHandler{
    Tank tank;

    public LogHander(Tank tank) {
        this.tank = tank;
    }

    @Override
    //代理需要自己执行的操作，写在newProxyInstance函数第三个参数的invoke参数里面
    //proxy：生成的代理对象：m
    //method:调用的什么方法：move()
    //args:应该往方法里传什么参数
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " start...");   //代理类要做的工作
        Object o = method.invoke(tank, args);   //method.invoke(Object obj,...):对obj类型调用method方法
        //等效于：tank.move(),当method()方法没有返回对象，o为null；
        System.out.println("method " + method.getName() + " end!");       //代理类要做的工作
        return o;
    }
}

interface Movable{
    void move();
}