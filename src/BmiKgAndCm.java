import java.util.Scanner;

public class BmiKgAndCm {
/*
Ask the user about their weight and height. Write a program that calculates the mass index (BMI)
BMI is below 		           18.5 		    ⇒underweight
BMI is equal or greater than 18.5 and below 25⇒normal.
BMI is equal or greater than 	25 and below 30⇒overweight
BMI is greater than or equal to 30  		  ⇒obese
Entrance:
Output:
Weight : 71kg
172cm
normal
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pls enter your weight (kg)");
        double weight=scan.nextDouble();
        System.out.println("pls enter your height (cm)");
        double height=scan.nextDouble();
        double BMI= weight/(height/100*height/100);
        if(BMI<18.5){
            System.out.println("underweight");
        }else if(BMI>=18.5 && BMI<25){
            System.out.println("normal");
        }else if(BMI>=25 && BMI<30){
            System.out.println("overweight");
        }else if(BMI>=30){
            System.out.println("obese");
        }
    }
}


