import java.util.Scanner;
public class Eng_For_While_7_PerfectNumber {
/*
    Write java code checking the number is Perfect number or not.
    Any number can be a Java Perfect Number if the sum of its positive
    divisors excluding the number itself is equal to that number.
    Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number
 */
    public static void main(String[] args) {
        int n=6;
        int sum=0;
        int i=1;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println("6 is Perfect Number.");
        }
        else
            System.out.println("7 is not Perfect Number.");
    }
}





