package factoryAbstract;

/**
 * @author 712
 * @function:具体产品：继承抽象产品
 * @create 2021/4/12 10:54
 */
public class FelixFelicity extends Food{
    @Override
    public void printName() {
        System.out.println("this is Felix Felicity");
    }
}
