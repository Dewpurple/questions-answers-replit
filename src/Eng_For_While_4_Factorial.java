public class Eng_For_While_4_Factorial {

    /*
   Write a return method that accepts an integer as input and calculates factorial and prints like output.
   Input : 6
   Output: 6!=65432*1=720
   */
    public static void main(String[] args) {
        factoriels();
    }
    private static int factoriels() {
        int num1 = 6;
        int mult = 1;
        for (int i = num1; i > 1; i--) {
            mult *= i;
        }
        System.out.println("6!=6*5*4*3*2*1=" + mult);
        return mult;
    }
}



