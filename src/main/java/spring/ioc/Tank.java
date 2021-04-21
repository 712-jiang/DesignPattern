package spring.ioc;

/**
 * @author 712
 * @function:
 * @create 2021/4/12 13:17
 */
public class Tank {
    Driver driver;    //通过xml自动注入属性

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
