package factoryAbstract;

/**
 * @author 712
 * @function:
 * @create 2021/4/11 22:10
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new HumanFactory();   //当需要其他类型的具体属性时，只需要替换new对象（对应不同的具体工厂）
        //下面的方法调用都不用修改，自动变为对应一族的属性
        Vehicle v = f.createVehicle();
        v.go();
        Communicate c = f.createCommunicate();
        c.machine();
        Food e = f.createFood();
        e.printName();
    }
}
