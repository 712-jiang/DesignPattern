package spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 712
 * @function:
 * @create 2021/4/12 13:15
 */
public class Main {
    public static void main(String[] args) {
        Driver d = new Driver();   //以前方法：这种创建方式不能控制创建过程：权限等等，为了弥补抽象工厂和工厂方法的缺点
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Tank t = (Tank) context.getBean("tank");   //Tank中字段：driver，通过xml文件动态添加，无需在程序里赋值
        System.out.println(t.driver);
    }
}
