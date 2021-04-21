package Aggregate;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author 712
 * @function:
 * @create 2021/4/14 14:13
 */
public class Main {
    public static void main(String[] args) {
        int[] ls = new int[]{1,2,3,4,5};
        OptionalInt max = Arrays
                        .stream(ls)
                        .filter(l->l<3)
                        .max();
        System.out.println(max);
    }
}
