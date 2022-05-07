import java.util.Scanner;

public class CalculateBmi {
    public static void main(String[] args) {
/*
Ask the user that their weight and height. Write a program that calculates the mass index (BMI)

You are underweight if your BMI is below 18.5
If your BMI is between 18.5 and 25, your weight is ideal.
You are obese between BMI 25-30
Obese if BMI is greater than or equal to 30
Entrance:
Output:
Weight : 71kg
male : 172cm
BMI: 23.99945916711736
underweight.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("pls enter your weight");
        double weight=scan.nextDouble();
        System.out.println("pls enter your height");
        double height=scan.nextDouble();
        double BMI= weight/(height/100*height/100);
        if(BMI<=18.5){
            System.out.println("underweight");
        }else if(BMI>18.5 && BMI<=25){
            System.out.println("normal");
        }else if(BMI>25 && BMI<30){
            System.out.println("overweight");
        }else if(BMI>=30) {
            System.out.println("obese");
        }
    }
}
