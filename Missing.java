// write a program to find the missing number in an array 
// time complexity is o(n)
// space complexity is o(1)
public class Missing {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7};
        int n= array.length;
        // sum of naturam number in array
        int sum_natural_num = ((n+1)*(n+2))/2;
        int sum = 0;
        // sum of current number present in array 
        for(int i=0; i<n; i++){
            sum += array[i];
        }
        int Missing_number = 0; 
         Missing_number = sum_natural_num - sum;
        System.out.println("Missing number is: "+ Missing_number);
    }
    
}
