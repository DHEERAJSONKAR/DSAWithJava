// find maximujm element in array.
class maximux{
    public static void main(String[]args){
        int[] arr={1,2,9,4,7,8};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element is: "+max);
    }
}