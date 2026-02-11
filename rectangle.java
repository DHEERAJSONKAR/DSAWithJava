// write a program to find a ak area of rectangle
import java.util.Scanner;
class rectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of recangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of recangle:");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("The area of rectangle is: " + area);
    }
}