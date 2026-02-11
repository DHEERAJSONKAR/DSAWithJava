import java.util.*;
class rupee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees:");
        double rupees = sc.nextDouble();
        double exchangerate = 83.0;
        double dollars = rupees / exchangerate;
        System.out.println(rupees + " rupees is equal to " + dollars + " dollars.");
    }
}