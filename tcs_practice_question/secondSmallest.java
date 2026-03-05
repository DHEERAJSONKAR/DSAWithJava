// find second smallest element in array.
class secondSmallest{
    public static void main(String[] args){
        int [] arr = {2,3,4,52,35,45,1};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        if(secondSmallest == Integer.MAX_VALUE){
            System.out.println("there is no second smallest element in array.");

        }
        else{
            System.out.println("the second smallest element in array: " + secondSmallest);
        }
    }
}