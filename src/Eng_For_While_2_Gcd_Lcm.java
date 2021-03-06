import java.util.Scanner;

public class Eng_For_While_2_Gcd_Lcm {
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
        System.out.println("Please enter two different integers ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        while (n1 != n2) {
            if (n1 > n2) {
                System.out.printf("GCD for first and second =  " + (n1 - n2));
                System.out.println();
                if (n1 > n2) {
                    System.out.println("LCM for first and second =" + (n1 * n2) / (n1 - n2));
                    break;
                }
            } else if (n2 > n1) {
                System.out.printf("GCD for first and second = " + (n2 - n1));
                System.out.println();
                if (n2 > n1) {
                    System.out.println("LCM for first and second = " + (n1 * n2) / (n2 - n1));
                    break;
                }
            }
            }
        }
    }

