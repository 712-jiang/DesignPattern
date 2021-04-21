package factorySimple;

/**
 * @author 712
 * @function:
 * @create 2021/4/11 21:29
 */
public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().createCar();
        m.go();
    }
}
