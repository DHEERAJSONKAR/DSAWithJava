// check duplicate element in array.
import java.util.HashSet;
class duplicateelement{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};
        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        for(int num: arr){
            if(set.contains(num)){
                hasDuplicate = true;
                System.out.println("Duplicate element found: "+num);
            }
            else{
                set.add(num);
            }
        }
        if(!hasDuplicate){
            System.out.println("No duplicate elements found.");
        }
    }
}