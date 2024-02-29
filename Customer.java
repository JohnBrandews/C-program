import java.util.Scanner;
public class Customer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] customer = new char[30];
        System.out.println("enter you customer's name");
        String name = input.next();
        System.out.println("enter your previous charges");
        double precharges = input.nextDouble();

        System.out.println("enter your current charges");
        double currcharges = input.nextDouble();

        double units =   (precharges-currcharges)*25.3;
        System.out.println("your units are: " + units);
    }
}
