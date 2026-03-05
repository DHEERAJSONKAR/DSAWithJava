// intersection in two array.
import java.util.HashSet;
class intersection{
    public static void main(String[] args){
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {2,3,4,5,6};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);

        }
        System.out.print("Intersection of the two arrays: ");
        for(int num : arr2){
            if(set.contains(num)){
                System.out.print(num + " ");
            }
        }
    }
}