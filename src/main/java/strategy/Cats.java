package strategy;

public class Cats implements Compareble<Cats>{
    int weight;
    public Cats(int weight) {
        this.weight = weight;
    }

    //猫的比较方法
    @Override
    public int comparaTo(Cats c) {
        if(this.weight > c.weight) return 1;
        else if(this.weight<c.weight) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "weight=" + weight +
                '}';
    }
}
