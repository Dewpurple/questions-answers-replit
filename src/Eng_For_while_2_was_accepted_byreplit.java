import java.util.Scanner;

public class Eng_For_while_2_was_accepted_byreplit {
    /*
   Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
   Input :
   30 and 40
   Expected OutPut:
   GCD for 30 and 40 = 10
   LCM for 30 and 40 = 120
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first integer ");
        int n1 = scan.nextInt();
        System.out.println("Please enter second integer ");
        int n2 = scan.nextInt();
        if (n1 == n2) {
            System.out.println("numbers have to be different");
        }
        while (n1 != n2) {
            if (n1 > n2) {
                System.out.printf("GCD for 30 and 40 =  " + (n1 - n2));
                System.out.println();
                if (n1 > n2) {
                    System.out.println("LCM for 30 and 40 =" + (n1 * n2) / (n1 - n2));
                }
            } else if (n2 > n1) {
                System.out.printf("GCD for 30 and 40 = " + (n2 - n1));
                System.out.println();
                if (n2 > n1) {
                    System.out.println("LCM for 30 and 40 = " + (n1 * n2) / (n2 - n1));
                    break;
                }
            }
        }
    }
}

