// 1. write a program to check whether a number is palindrome or not. 
// time complexity: O(n)
// space complexity: O(1)
class Palindrome{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 2, 1};
        int n = array.length;
        int flag = 0;
        for(int i =0; i<n/2; i++){
            if(array[i] != array[n-i-1]) {
                flag = 1;
                System.out.println("It's not a polindrome number.");
break;
            }
        }
        if(flag == 0){
            System.out.println("Is's a palindrome number.");
        }

    }
}