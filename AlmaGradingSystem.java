import java.util.Scanner;

public class AlmaGradingSystem {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       char actualGrade = 'C';

       System.out.print("Enter your grade (A, B, C, D, or F): ");
       char grade = scanner.next().charAt(0);

       switch (grade){
       case 'A':
           System.out.println("Excellent! You scored above 90.");
           break;
       case 'B':
           System.out.println("Well done! You scored between 80 and 90.");
           break;
       case 'C':
           System.out.println("Good effort! You scored between 70 and 80.");
           break;
       case 'D':
           System.out.println("You passed, but consider improving. You scored between 60 and 70.");
           break;
       case 'F':
           System.out.println("Unfortunately, you failed. You scored below 60.");
           break;
       default:
           System.out.println("Invalid grade input.");
           break;
       
    }

       scanner.close();
   }
}

