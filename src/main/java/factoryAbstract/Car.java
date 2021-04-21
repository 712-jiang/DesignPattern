package factoryAbstract;

/**
 * @author 712
 * @function:具体产品：继承抽象产品
 * @create 2021/4/11 22:10
 */
public class Car extends Vehicle{
    @Override
    public void go() {
        System.out.println("car go wuwuw~~");
    }
}
