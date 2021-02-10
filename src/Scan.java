import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        double number = input.nextInt();
        System.out.println("Your number is: " + number);
    }
}