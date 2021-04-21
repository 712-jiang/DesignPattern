package spring.aop.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 712
 * @function: xml 配置 实现AOP
 * @create 2021/4/15 15:11
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appaop.xml");
        Ship t = (Ship) context.getBean("ship");
        t.move();
        Travel travel = (Travel) context.getBean("travel");
        travel.go();
    }
}
