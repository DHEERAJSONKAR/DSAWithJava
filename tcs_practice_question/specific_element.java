// find specfic element in array.
class specific_element{
    public static void main(String[] args){
        int arr[] = {12,3,4,56,78,434,55};
        int target = 56;
        boolean found = false;
        for(int num : arr){
            if(num == target){
                found = true;
                break;    
                          }
        }       
        if(found){
            System.out.println("Element found in the array: " + target);
        }
        else{
            System.out.println("Element not found in the array.");
        }
    }
}