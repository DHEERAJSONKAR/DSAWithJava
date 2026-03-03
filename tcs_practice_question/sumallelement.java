// Write a program to find the sum of all elements in an array.
class sumallelement{
    public static void main(String[] args){
        int [] arr = {34,5,6,23,56};
        int sum =0;
        for(int i= 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all element is: " + sum);
    }
}