package AlmaJava_playground;
import java.util.Scanner;
public class HelloWorld {
    public static void main (String[] args) {
            System.out.println("Hello! What is your name? ");
            Scanner s = new Scanner(System.in);
            String name = "";
            name = s.nextLine();
            System.out.println("Hello " + name);
            System.out.println("How old are you? ");
            int age = 0;
            age = s.nextInt();
            System.out.println("You are " + age + " years old!");
            if (age <= 25 ) {
                System.out.println ("You are 25 years old or younger.");
            }
            else if (age>25) 
            {
                System.out.println ("You are older than 25");
            }
            int number = 10;
            int sum = age + number;
            System.out.println("In 10 years you will be: " + sum);
            s.close();
           int i = 0;
            while ( i < 10) {

                System.out.println("*");
                i+= 1;

            }
    }
}