package Observer;

/**
 * @author 712
 * @function:
 * @create 2021/4/13 21:27
 */
public class Dad extends ObserverObject{

    public void feed(){
        System.out.println("dad is feeding.....");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        System.out.println("baby is cry at " + event.time);
        feed();
    }
}
