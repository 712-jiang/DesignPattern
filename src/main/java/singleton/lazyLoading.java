package singleton;

/**
 * @author qingqing
 * @function:lazy loading 懒汉式
 * 什么时候用，什么时候初始化
 * 在getInstance中new实例
 * 多线程时，可能产生多个不同实例的问题
 * @create 2021-04-09-17:36
 */
public class lazyLoading {
    //先不实例化
    private static lazyLoading INSTANCE;
    private lazyLoading(){
    }
    //避免多线程安全问题，在getInstance上加synchronized锁
    public static /*synchronized*/ lazyLoading getInstance() throws InterruptedException {
        if(INSTANCE == null){
            //用延迟测试懒汉式多线程不安全
            //一个线程在if中还new，另一个线程判断if为true，也进来new，就产生了两个不同的INSTANCE
            //效率降低
            Thread.sleep(10);
            INSTANCE = new lazyLoading();
        }
        return INSTANCE;
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            new Thread(()->{
                lazyLoading l = null;
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
