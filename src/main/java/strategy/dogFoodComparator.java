package strategy;

public class dogFoodComparator implements Comparator<Dogs>{
    @Override
    public int compare(Dogs o1, Dogs o2) {
        if (o1.food<o2.food) return -1;
        else if(o1.food>o2.food) return 1;
        return 0;
    }
}
