package factoryAbstract;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author 712
 * @function:具体产品：继承抽象产品
 * @create 2021/4/11 22:10
 */
public class Hambger extends Food{
    @Override
    public void printName(){
        System.out.println("this is Hambger");
    }
}
