package strategy;

public class Dogs implements Compareble<Dogs>{
    int weight;
    int food;
    public Dogs(int weight,int food) {
        this.weight = weight;
        this.food = food;
    }

    //狗的比较方式
    @Override
    public int comparaTo(Dogs d) {
        if(this.weight < d.weight) return 1;
        else if(this.weight > d.weight) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "weight=" + weight +
                ", food=" + food +
                '}';
    }
}
