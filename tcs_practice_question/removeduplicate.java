// remove duplicate in array.
// import java.util.HashSet;
// class removeduplicate{
//     public static void main(String[] args){
//         int[] arr = {34,23,34,23,45,67,56,78}; 
//         HashSet<Integer> set = new HashSet<>();
//         for(int num: arr){
//             set.add(num);
//         }
//         System.out.println("Array after removing duplicates:" +set);
//         System.out.println("the number of unique elements in the array: " +set.size());
//     }
// }
// remove dulpicate in sorted element in array using two pointer.
class removeduplicate{
    public static void main(String[] args){
        int[] arr = {1,1,2,3,3};
       
        
        int i = 0;
        for(int j =1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Array after removing duplicates:"); 
        for(int k = 0; k <= i; k++){
            System.out.print(arr[k] + " ");
        }
    }
} 