package strategy;

public abstract class Animals {
    int weight;

    public Animals(int weight) {
        this.weight = weight;
    }
    public int compareTo(Animals animals){
        return 0;
    }
}
