package Iterator.v1;

import sun.awt.image.ImageWatched;

import java.util.List;

/**
 * @author 712
 * @function: 自定义两个数据结构，实现add和size方法
 * @create 2021/4/15 17:44
 */
public class Main {
    public static void main(String[] args) {
        Collection_ arrayList_ = new ArrayList_();
        Collection_ linkedList_ = new LinkedList_();
        arrayList_.add("ddd");
        arrayList_.add(111);
        linkedList_.add(222);
        linkedList_.add("ccc");
        System.out.println(arrayList_.toString());
        linkedList_.size();
    }
}
