package singleton;

/**
 * @author qingqing
 * @function:懒汉式改进二：静态内部类中new
 * 由jvm保证多线程安全：jvm中一个类只会被加载一次,类中的静态内部类（其中新建实例对象）也只会被加载一次
 * 加载外部类的时候不会加载内部类
 * @create 2021-04-09-18:24
 */
public class lazyLoadingStatic {
    private lazyLoadingStatic(){
    }
    //由jvm保证多线程安全：jvm中一个类只会被加载一次,类中的静态内部类（其中新建实例对象）也只会被加载一次
    private static class instanceHolder{
        private final static lazyLoadingStatic INSTANCE = new lazyLoadingStatic();
    }
    public static lazyLoadingStatic getInstance(){
        return instanceHolder.INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(lazyLoadingStatic.getInstance().hashCode());
            }).start();
        }
    }
}

