package AlmaExercises.Exercises3;

public class Exercises3 {
    public static void main(String[] args) {

Book book = new Book();
System.out.println("Booktitle: " + book.title + " . Book year: " + book.year + " . Book author: " + book.author);

Student A = new Student(23, "Alma", 70.5);
System.out.println("Age: " + A.age + ". Name: "  + A.name + ". Grade: " + A.grade);

Car one = new Car ();
System.out.println(one.color + one.make + one.model + one.year);

Car two = new Car("Volvo", "xc90");
System.out.println(two.color + " " + two.make + " " + two.model + " " + two.year);

Car three = new Car("Toyota","Avensis", 2015, "Green" );
System.out.println(three.color + " " + three.make + " " + three.model + " " + three.year);





    }

}
