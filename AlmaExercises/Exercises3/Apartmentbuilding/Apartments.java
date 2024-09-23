package AlmaExercises.Exercises3.Apartmentbuilding;

public class Apartments {
    int level;
    String familySize;
    boolean disturbing;

    public Apartments (){
        this.level = 1;
        this.familySize = "small";
        this.disturbing = false;
    }

    public Apartments (int level, String familySize, boolean disturbing){
        this.level = level;
        this.familySize = familySize;
        this.disturbing = disturbing;
    }

    public static void printApartments(Apartments levelObjects){
        System.out.println("On level "+ levelObjects.level);
        System.out.println("lives a " +levelObjects.familySize + " family.");
        System.out.println("Are they disturbing? "+levelObjects.disturbing);
        System.out.println();
    }
}


