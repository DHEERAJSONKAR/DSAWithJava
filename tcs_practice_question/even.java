// count even and odd number in an array. and how to cound it?
class even{
    public static void main(String[]args){
        int [] arr = {1,2,3,4,53,44,54,55,34};
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }   

        }
        System.out.println("Even Count number: " + evenCount);
        System.out.println("Odd Count number: " + oddCount);
    }
}