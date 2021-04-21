package singleton;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * @author qingqing
 * @function:  饿汉模式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全：保证类在内存中只加载一次
 * 缺点：无论能否用到，类装载时就完成实例化
 * @create 2021-04-09-17:11
 */
public class Mgr01 {
    //在类中实例化，保证外部无法再实例化当前类
    //final：构造器执行之前，INSTANCE已经实例化
    //static：INSTANCE唯一，被共享,无论调用多少次getINstance获得实例，都指向INSTANCE
    private static final Mgr01 INSTANCE = new Mgr01();
    //private:类外无法通过new得实例
    private Mgr01(){};   //构造函数设为private
    //通过类内类外通过getInstance调用多少次，返回的实例都是INSTANCE它自己
    public static Mgr01 getInstance(){
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args){
        System.out.println(INSTANCE);
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);   //对比两个实例是否相同
    }
}
