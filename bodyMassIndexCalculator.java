import java.util.Scanner;
import java.lang.Math;

public class bodyMassIndexCalculator {

    public static void main(String[] args) {
        System.out.println("Provide your weight in kilograms: ");
        Scanner w = new Scanner(System.in);
        double weight = w.nextDouble();
        System.out.println("Provide your height in meters: ");
        Scanner h = new Scanner(System.in);
        double height = h.nextDouble();
        double bmi = weight / Math.pow(height,2);
        System.out.println("You're bmi is: " + bmi);
        if (bmi >= 30)
            System.out.println("Your body mass index indicates obesity");
        else if (bmi >=25)
            System.out.println("Your body mass index indicates you are overweight");
        
        else if (bmi >= 18.5)
            System.out.println("Your body mass index indicates your weight is perfectly healthy");
        else
            System.out.println("Your body mass index indicates you are underweight");
               
	}
}     