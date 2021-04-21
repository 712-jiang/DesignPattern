package Bridge;

/**
 * @author 712
 * @function:
 * @create 2021/4/16 10:07
 */
public class WildGift extends Gift{
    public WildGift(GiftImpl gimpl) {
        this.gimpl = gimpl;   //这里的this是指向父类的Gift
    }
}
