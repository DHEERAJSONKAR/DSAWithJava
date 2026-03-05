// find two sum problem in array.
import java.util.HashMap;
class sumproblem{
    public static void main(String[] args){
        int [] arr = {2,7,11,15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println("Two sum found at indices: " + map.get(complement) + " and " + i);
                break;
                
            }
            map.put(arr[i],i);
        }
                
    }
}