package AlmaExercises.Exercises4;

public class myStringMethods {
    public static void main(String[] args) {
        reverseString("Hello my name is Alma");



    }



    public static String reverseString(String x){
    int nr = x.length()-1;
    for (int i = nr; i>=0; i-- ){
    char reverse = x.charAt(i);
    System.out.println(reverse);
    }

        return x;
    }

    public static String countCharacters(String x, char y){
    while(x.contains(char y)){

    }

        return x;

    }
    
}
