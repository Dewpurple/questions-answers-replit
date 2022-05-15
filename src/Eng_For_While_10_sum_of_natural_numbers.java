public class Eng_For_While_10_sum_of_natural_numbers {
    public static void main(String[] args) {
    /*
    Write a Program to find the sum of natural numbers from 1 to 100.
    OUTPUT : Sum of Natural Numbers 5050
    */
        int k=0;
        int sum=0;
        while(k<100){
            k++;
            sum+=k;
        }
        System.out.println("Sum of Natural Numbers " +sum);
    }
}


