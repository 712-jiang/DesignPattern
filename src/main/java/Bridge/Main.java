package Bridge;

/**
 * @author 712
 * @function: 桥接模式：将抽象部分Gift和实现部分GiftImpl 两个继承树分开发展，通过聚合在Gift中实现GiftImpl实例，为Gift子类使用
 * @create 2021/4/16 10:05
 */
public class Main {
    public static void main(String[] args) {
        Gift warmBook = new WarmGift(new Book());
        Gift wildBook = new WildGift(new Book());
        System.out.println(warmBook.equals(wildBook));
    }
}
