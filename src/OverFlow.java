import java.util.Scanner;

public class OverFlow {
    public static void main(String[] args) {
         /*
Write code that calculates and prints the sum of two given numbers (greater than or equal to zero). If total is more than 10 digits, print "OverFlow".
INPUT:
25
46
OUTPUT:
Sum of Numbers:
71
     */
            Scanner scan = new Scanner(System.in);
            System.out.println("pls enter a number");
            int num1 = scan.nextInt();
            System.out.println("pls enter a number");
            int num2 = scan.nextInt();
            if (num1 + num2 < 0) {
                System.out.println("sum of two numbers have to be positive");
            } else if ((num1 + num2) <= 999999999) {
                System.out.println(num1 + num2);
            } else if ((num1 + num2) > 999999999) {
                System.out.println("OverFlow!");
            }
        }
    }



