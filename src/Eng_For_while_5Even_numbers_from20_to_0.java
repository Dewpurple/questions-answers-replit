public class Eng_For_while_5Even_numbers_from20_to_0 {
    /*
    Print even numbers from 20 to 0 but do not use decrement (i--).
    OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
          */
    public static void main(String[] args) {
        System.out.print("Even Numbers from 20 to 0 are: ");
        int k = 22;
        while (k >= 1) {
            k -= 2;
            System.out.print(k + " ");
        }
    }
}

