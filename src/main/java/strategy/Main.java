package strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //调用排序器进行排序
        Dogs[] animals_dog = {new Dogs(3,10), new Dogs(5,5), new Dogs(1,2)};
        Cats[] animals_cat = {new Cats(3), new Cats(5), new Cats(1)};
        Sorter<Dogs> sorter_d = new Sorter();
        Sorter<Cats> sorter_c = new Sorter();
        dogFoodComparator D1 = new dogFoodComparator();
        catWeightComparator C1 = new catWeightComparator();
        sorter_d.sort(animals_dog,D1);
        sorter_c.sort(animals_cat,C1);
        System.out.println(Arrays.toString(animals_cat));
        System.out.println(Arrays.toString(animals_dog));
    }
}
