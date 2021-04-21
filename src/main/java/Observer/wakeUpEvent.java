package Observer;

/**
 * @author 712
 * @function:
 * @create 2021/4/13 21:23
 */
public class wakeUpEvent extends Event<Baby> {
    long time;
    String loc;
    Baby source;

    public wakeUpEvent(long time, String loc, Baby source) {
        this.time = time;
        this.loc = loc;
        this.source = source;
    }

    @Override
    public Baby getSource() {
        return source;
    }
}
