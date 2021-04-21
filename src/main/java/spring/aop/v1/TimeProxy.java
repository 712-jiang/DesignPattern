package spring.aop.v1;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 15:18
 */
public class TimeProxy {
    public void before(){
        System.out.println("method start: " + System.currentTimeMillis());
    }
    public void after(){
        System.out.println("method end： " + System.currentTimeMillis());
    }

}
