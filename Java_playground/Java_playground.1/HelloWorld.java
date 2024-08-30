import java.util.Scanner;
public class HelloWorld {
    public static void main (String[] args) {
            System.out.println("Hello! What is your name? ");
            Scanner s = new Scanner(System.in);
            String name = "";
            name = s.nextLine();
            System.out.print("Hello " + name);
            s.close();
    }
}