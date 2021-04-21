package strategy;

public class Sorter<T>{
    //如果规定sort方法传入参数类型，就只能对某种对象排序，不够灵活
    //如果使用Object作为参数类型，Object没有compareTo方法，不能实现compareTo方法多态
    //使用Comparabale类，其中有compareTo方法，可以Override！
    public void sort(T[] arr, Comparator<T> comparator){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                minPos=comparator.compare(arr[i],arr[j]) >0 ? j:minPos;
            }
            swap(arr,i,minPos);
        }
    }
    void swap(T[] arr,int i,int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
