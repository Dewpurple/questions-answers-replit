public class Eng_For_While_10_sum_of_natural_numbers {
    public static void main(String[] args) {
    /*
    Write a java program to reverse the number which user entered.
    Input :1238
    Output :Reverse Of The Number: 8321
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


