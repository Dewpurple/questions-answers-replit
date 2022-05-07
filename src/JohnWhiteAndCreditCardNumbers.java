import java.util.Scanner;

public class JohnWhiteAndCreditCardNumbers {

    public static void main(String[] args) {
        /*
Write codes that convert a user's name  surname, and credit card numbers to the given format.
Input :
John White
1234234534561478
Output: Name:
J*** W****
CCN: **** **** **** 1478
Initial letters have to start with uppercase.
 */
            Scanner scan= new Scanner(System.in);
            System.out.println("pls enter your name and surname");
            String strN=scan.nextLine();
            System.out.println("pls enter your credit card number");
            String ccN = scan.next();
            String str = strN.substring(0, 1);
            int strIdx = strN.indexOf(" ") + 1;
            String strIdxL = strN.substring(strIdx, strIdx + 1);
            String strLastName = strN.substring(strIdx + 1);
            String replaceForLastName = strLastName.replaceAll("\\w", "*");
            String newFirstN = strN.substring(1, strIdx);
            String replaceM = newFirstN.replaceAll("\\w", "*");
            System.out.print(str + replaceM + strIdxL + replaceForLastName);
            System.out.println("\nCCN  : **** **** **** " + ccN.substring(12));
        }
    }


