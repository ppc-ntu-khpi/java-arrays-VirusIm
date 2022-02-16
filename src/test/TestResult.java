import java.util.Random;
import java.util.Scanner;
import domain.Exercise;

public class TestResult {
   public static void main(String[] args)
   {
       Scanner myObj = new Scanner(System.in);  
       System.out.print("Enter number of the range: ");
       int range = myObj.nextInt(); //считывает число которое ввёл пользователь
       Exercise.Calculate(range);
   }
}
