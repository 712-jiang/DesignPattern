package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 712
 * @function:
 * @create 2021/4/13 21:26
 */
public class Baby {
    private List<ObserverObject> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mom());
    }
    public void Wakeup(){
        System.out.println("baby wakeup, wuwuwuw~");
        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bed", this);

        for(ObserverObject o:observers){
            o.actionOnWakeUp(event);
        }
    }
}
