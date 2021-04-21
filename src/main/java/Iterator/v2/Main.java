package Iterator.v2;

/**
 * @author 712
 * @function: 增加Iterator接口
 * 【问题：】如何通过调用一个方法，无差别地遍历每个数据类型？
 * 【解决：】将实际的遍历方式写在数据类中，并实现Iterator方法
 * 也可以对下面的类型都使用泛型
 * @create 2021/4/15 17:44
 */
public class Main {
    public static void main(String[] args) {
        Collection_ arrayList_ = new ArrayList_();
        Collection_ linkedList_ = new ArrayList_();

        arrayList_.add(new String("s"));
        arrayList_.add(new String("a"));
        arrayList_.size();

        linkedList_.add(new String("s"));
        linkedList_.add(new String("b"));
        linkedList_.size();

        Iterator_ ai = arrayList_.iterator();
        Iterator_ li = linkedList_.iterator();

        while(ai.hasNext()){
            Object o = ai.next();
            System.out.println(o);
        }

        while(li.hasNext()){
            Object o = li.next();
            System.out.println(o);
        }
    }
}
