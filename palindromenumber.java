import java.util.*;
class palindromenumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        while(num !=0){
            int lastdigit = num%10;
            reverse = reverse*10 + lastdigit;
            num = num/10;
            
        }
        if(original == reverse){
            System.out.println("It's a palindrome number.");
        }
        else{
            System.out.println("It's not a palindrome number.");
        }
    }
}