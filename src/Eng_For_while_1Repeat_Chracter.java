import java.util.Scanner;

public class Eng_For_while_1Repeat_Chracter {
    public static void main(String[] args) {
      /*
    Ask user to enter a name and a character,
    then check how many times the character is repeated in the name using loops in the name
    e.g:
    char ch1= 'a' ;
    String name =“John came late"
    Expected Output: Number of a = 2
     */
            Scanner scan= new Scanner(System.in);
            System.out.println("Please enter a sentence");
            String name1=scan.nextLine();
            char ch1 = 'a';
            int sum = 0;
            for (int i = 0; i < name1.length(); i++) {
                if (name1.charAt(i) == (ch1)) {
                    sum++;
                }
            }
            System.out.println("number of a = " + sum);
        }
    }


