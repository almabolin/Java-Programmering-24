import java.util.Scanner;

public class MenuSelection {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Choose an option:");
       System.out.println("1. Start");
       System.out.println("2. Settings");
       System.out.println("3. Exit");
       
       int choice = scanner.nextInt();
       
       switch (choice) {
        case 1: 
        System.out.println("You have chosen START"); 
        break;
        case 2:
         System.out.println("You have chosen SETTINGS");
         break;
        case 3: 
        System.out.println("You have chosen EXIT");
        break;
        default:
         System.out.println("You have to choose a valid option!");
         break;
       }
       
       scanner.close();
   }
}
// For clarity, this comment is here to show that the MenuSelection code ends here.
