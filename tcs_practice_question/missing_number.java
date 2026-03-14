// find a missing number in an array.
class missing_number{
    public static void main(String[] args){
        int arr[] = {1,2,3,5,6,7,8};
        int n = arr. length + 1; // since one number is missing, the length of the array is n-1
        int expected_sum = n*(n+1)/2;
        int actual_sum = 0;
        for(int num : arr){
            actual_sum += num;
        }
        int missing_number = expected_sum - actual_sum;
        System.out.println("Missing number is: " + missing_number);
    }
} 