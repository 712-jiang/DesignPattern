package factoryAbstract;

/**
 * @author 712
 * @function:具体产品：继承抽象产品
 * @create 2021/4/11 22:16
 */
public class Broom extends Vehicle{
    @Override
    public void go(){
        System.out.println("broom go chengcheng~~");
    }
}
