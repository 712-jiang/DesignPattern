package singleton;

/**
 * @author qingqing
 * @function: 枚举单例：解决线程同步安全，防止反序列化
 * 枚举，在第一次被真正用到的时候，会被虚拟机加载并初始化，而这个初始化过程是线程安全的。
 * 反序列化：
 *  普通的Java类反序列化:
 *      会通过反射调用类的默认构造函数来初始化对象。
 *      即使单例中构造函数是私有的，也会被反射给破坏掉。
 *      由于反序列化后的对象是重新new出来的，所以这就破坏了单例。
 *  枚举类：
 *      枚举类型在序列化时Java仅将枚举对象的name属性输出到结果中，
 *      反序列化的时候则是通过java.lang.Enum的valueOf方法来根据名字查找枚举对象。并不是通过构造函数创建新的实例
 * @create 2021-04-09-20:28
 */
public enum enumSingleton {
    INSTANCE;
    //测试方法
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->{
                System.out.println(enumSingleton.INSTANCE.hashCode());
            }).start();
        }
    }
}
