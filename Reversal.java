// write a program to reverse an array in Java
// time comlexity: o(n)
// space complexity: O(1)
class Reversal{
    public static void main(String[] args) {
        int[] array = {1,3,5,7,8,3,5};
        int n= array.length;
        for(int i=0; i<n/2; i++){
            // swap the elements between array[i] and array[n-i-1]
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        System.out.print("Reverse array is: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + "");
        }
        System.out.println(" ");
    }
}