// find minimum element in array.
class minimum{
    public static void main(String[]args){
        int[] arr = {23,45,23,56,78,56};
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("minimum element is: "+min);
    }
}