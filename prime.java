import java.util.Scanner;
class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num<=1){
            isprime = false;
        }
        for(int i =2; i * i <=num; i++){
            if(num % i == 0){
                isprime = false;
                break;
            }

        }
        if(isprime){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
}