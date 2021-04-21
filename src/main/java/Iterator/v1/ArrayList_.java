package Iterator.v1;

import Iterator.v2.Iterator_;

import java.util.Arrays;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 17:45
 */
public class ArrayList_ implements Collection_{
    Object[] object = new Object[10];
    int index =0;
    @Override
    public void add(Object o) {
        if(object.length == index){
            String[] newObject = new String[object.length *2];
            System.arraycopy(object,0,newObject,0,object.length);
            object = newObject;
        }
        object[index] = o;
        index ++;
    }

    @Override
    public void size() {
        System.out.println(index);
    }

    @Override
    public String toString() {
        return "ArrayList_{" +
                "object=" + Arrays.toString(object) +
                '}';
    }


}
