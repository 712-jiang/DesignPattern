package factoryAbstract;

/**
 * @author 712
 * @function:具体产品：继承抽象产品
 * @create 2021/4/11 22:12
 */
public class Owl extends Communicate{
    @Override
    public void machine(){
        System.out.println("we use owl");
    }
}
