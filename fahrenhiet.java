// celsius to fahrenhiel
import java.util.Scanner;
class fahrenheit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in celcius:");
        double celcius = sc.nextDouble();
        double fahrenheit = (celcius * 9/5) + 32;
        System.out.println("The Temperature in fahrenheit is: " + fahrenheit);
    }
}