package Apartmentbuilding;
import java.util.Scanner;

public class mainForApartment {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Apartments level2 = new Apartments(2, "big",true);
        Apartments level1 = new Apartments();

        System.out.println("Welcome to the apartment building.");
        System.out.println("-------------------------------------");
        System.out.println("Would you like to register a new family [1] or print the details of a current family from the apartmentbuilding [2]?");
        int choice1 = s.nextInt();

        switch(choice1){
        case 1:
        System.out.println("Enter which level the new family will live on: ");
        int choicelevel = s.nextInt();

        System.out.println("Enter if the family is big or small: ");
        String choicefamilySize = s.next();

        System.out.println("Enter True or False if the family is a disturbance to the others in the apartmentbuilding :");
        boolean choicedisturbing = s.nextBoolean();
        Apartments levelNew = new Apartments(choicelevel, choicefamilySize, choicedisturbing);
        Apartments.printApartments(levelNew);
        break;
        
        case 2:
        System.out.println("On which apartment would you like to print the details?");
        int choice2 = s.nextInt();
        switch (choice2){
        case 1:
        Apartments.printApartments(level1);
        break;
        case 2:
        Apartments.printApartments(level2);
        break;
        }
    }



    }
}
