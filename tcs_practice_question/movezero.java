// Move all the zeroes to the end of the array while maintaining the relative order of the non-zero elements.
class movezero{
    public static void main(String[] args){
        int arr[] ={0,3,4,0,2,0,6};
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}