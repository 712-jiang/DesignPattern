package Iterator.v2;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 17:45
 */
public interface Collection_ {
    public void add(Object o);
    public void size();
    Iterator_ iterator();  //增加迭代器
}
