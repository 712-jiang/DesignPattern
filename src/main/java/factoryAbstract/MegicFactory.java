package factoryAbstract;

/**
 * @author 712
 * @function:具体工厂：魔法工厂--继承抽象工厂
 * @create 2021/4/12 10:46
 */
public class MegicFactory extends AbstractFactory{
    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Food createFood() {
        return new FelixFelicity();
    }

    @Override
    public Communicate createCommunicate() {
        return new Owl();
    }
}
