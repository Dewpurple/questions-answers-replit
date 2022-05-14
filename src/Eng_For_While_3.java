import java.util.ArrayList;

public class Eng_For_While_3 {

    public static void main(String[] args) {
    /*
    Write a code that returns the duplicate chars in a String array.(interview Question)
    Input :
    String str=“Javaisalsoeasy”
    Output: [a, s]
    */
        String str = "Javaisalsoeasy";
        char[] arr = str.toCharArray();
        ArrayList<Character> Output = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !Output.contains(arr[j])) {
                    Output.add(arr[j]);
                }
            }
        }
        System.out.println("Output : " + Output);
    }

}