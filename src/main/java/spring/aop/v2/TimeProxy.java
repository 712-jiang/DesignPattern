package spring.aop.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 15:18
 */
@Aspect
public class TimeProxy {
    @Before("execution(void spring.aop.v2.Ship.move())")
    public void before(){
        System.out.println("method start: " + System.currentTimeMillis());
    }
    @After("execution(void spring.aop.v2.Travel.go())")
    public void after(){
        System.out.println("method end： " + System.currentTimeMillis());
    }

}
