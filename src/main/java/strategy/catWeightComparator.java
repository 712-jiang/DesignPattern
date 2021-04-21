package strategy;

public class catWeightComparator implements Comparator<Cats> {
    @Override
    public int compare(Cats o1, Cats o2) {
        if (o1.weight<o2.weight) return -1;
        else if(o1.weight>o2.weight) return 1;
        return 0;
    }
}
