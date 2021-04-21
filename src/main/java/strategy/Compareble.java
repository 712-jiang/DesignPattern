package strategy;

//如果希望comparaTo可以接收不同类型参数，用繁星
public interface Compareble<T> {
    public int comparaTo(T o);
}
