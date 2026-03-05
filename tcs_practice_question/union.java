// union of two array.
import java.util.HashSet;
class union{
    public static void main(String[]args){
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,6,7,8};
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr1){
            set.add(num);
        }
        for(int num: arr2){
            set.add(num);
        }
        System.out.println("Union of the two arrays: " + set);
    }
}