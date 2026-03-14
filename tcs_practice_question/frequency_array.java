// find a frequency in a array.
import java.util.HashMap;
class frequency_array{
    public static void main(String[] args){
        HashMap<Integer, Integer> Map = new HashMap<>();
        int arr[] = {1,2,1,2,3,4,3,4,2,1,2,3,4,};
        for(int num : arr){
            if(Map.containsKey(num)){
                Map.put(num, Map.get(num)+1);
            }
            else{
                Map.put(num, 1);
            }
            
        }
        for(Integer key : Map.keySet()){
            System.out.println(key + " -> " + Map.get(key));
        }
        
    }
}