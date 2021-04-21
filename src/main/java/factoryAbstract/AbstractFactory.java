package factoryAbstract;

/**
 * @author 712
 * @function:  定义抽象工厂：里面放所有族都需要的方法
 * @create 2021/4/12 10:01
 */
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();  //工厂方法
    public abstract Food createFood();
    public abstract Communicate createCommunicate();
}
