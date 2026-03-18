// rigth rotate by 1.
class rigth_rotate{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int end = arr[arr.length -1];
        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0]= end;
      for(int num : arr){
        System.out.print(num + " ");
      }
    }
}