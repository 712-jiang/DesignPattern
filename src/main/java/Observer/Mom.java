package Observer;

/**
 * @author 712
 * @function:
 * @create 2021/4/13 21:29
 */
public class Mom extends ObserverObject{

    public void hug(){
        System.out.println("mom is hugging......");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        System.out.println("baby stays at "+ event.loc);
        if(event.loc !="bed")
            hug();
    }
}
