package AlmaExercises.Exercises3;

public class Person {
    String name;
    int age;
    double height;


    Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    Person(){
        this("Alma", 23, 163.5);
    }
    
}
