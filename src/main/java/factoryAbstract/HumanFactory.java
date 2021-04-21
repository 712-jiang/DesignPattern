package factoryAbstract;

/**
 * @author 712
 * @function:具体工厂：人类工厂--继承抽象工厂
 * @create 2021/4/12 10:46
 */
public class HumanFactory extends AbstractFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Food createFood() {
        return new Hambger();
    }

    @Override
    public Communicate createCommunicate() {
        return new iPhone();
    }
}
