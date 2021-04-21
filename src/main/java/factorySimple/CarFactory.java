package factorySimple;

/**
 * @author 712
 * @function:
 * @create 2021/4/11 22:00
 */
public class CarFactory {
    public Moveable createCar(){
        System.out.println("this is a car");
        return new Car();
    }
}
