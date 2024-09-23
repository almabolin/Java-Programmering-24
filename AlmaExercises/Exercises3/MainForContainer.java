package AlmaExercises.Exercises3;

public class MainForContainer {
    public static void main(String[] args) {
        ContainerPerson first = new ContainerPerson();
      first.Alma.age =23;
      first.Alma.height = 163.5;
      first.Alma.name = "Alma";
      System.out.println(first.Alma.name + "'s age is: " + first.Alma.age + ". She is " + first.Alma.height + " cm tall!");


      first.Anton.age =25;
      first.Anton.height = 176.7;
      first.Anton.name = "Anton";
      System.out.println(first.Anton.name + "'s age is: " + first.Anton.age + ". He is " + first.Anton.height + " cm tall!");

first.Alma.age = 24; 
System.out.println("Wow Alma just had a birthday, she is now " + first.Alma.age);

Person Lilja = new Person("Lilja", 13, 150.5);
Person Mirja = first.Alma;

System.out.println(first.Alma);
System.out.println(first.Anton);
System.out.println(Lilja);
System.out.println(Mirja);
//Alma & Mirja har samma referensvärde eftersom Mirja inte fått ett eget objekt, utan får samma som Almas

    }
}
