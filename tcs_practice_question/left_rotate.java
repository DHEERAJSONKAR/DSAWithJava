// Left rotate array by 1
class left_rotate{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int start = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = start;
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}