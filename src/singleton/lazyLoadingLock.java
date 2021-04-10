package singleton;

/**
 * @author qingqing
 * @function:懒汉式改进一：双重检查，两次判断INSTANCE == null
 * @create 2021-04-09-18:12
 */
public class lazyLoadingLock {
    //先不实例化
    private static volatile lazyLoadingLock INSTANCE;  //加volatile防止指令重排
    private lazyLoadingLock(){
    }
    //避免多线程安全问题，在getInstance上加synchronized锁
    public static lazyLoadingLock getInstance() throws InterruptedException {
        //只有在INSTANCE为null的时候，才需要竞争锁，当INSTANCE已经被创建，不需要锁
        if(INSTANCE == null){
            //用同步代码块
            //双重检查,比直接将synchronize添加到getInstance方法上更高效
            synchronized (lazyLoadingLock.class){
                if(INSTANCE == null){
                    Thread.sleep(10);
                    INSTANCE = new lazyLoadingLock();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            new Thread(()->{
                lazyLoadingLock l = null;
                try {
                    l = getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(l.hashCode());
            }).start();
        }
    }
}
