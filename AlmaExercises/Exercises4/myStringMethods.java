package AlmaExercises.Exercises4;

public class myStringMethods {
    public static void main(String[] args) {
        reverseString("hejhej välkommen till din arbetsplats!");
        countCharacters("Hejsan, hur mår du?", 'u');
        isValidEmail("Alma.bolin@live.live");

    }

//------------------------------------------------------------------------------------------------------

    public static String reverseString(String x){
    int nr = x.length()-1;
    for (int i = nr; i>=0; i-- ){
    char reverse = x.charAt(i);
    System.out.println(reverse);
    }
        return x;
    }


    public static String countCharacters(String x, char y){
    int times = 0;
    int nr = x.length();
    for(int i = 0; i <=nr-1; i++ ){
     char a = x.charAt(i);
     if(a == y){
        times ++;     
     }
    }
    System.out.println("The word " + x + " contains the character " + y + ": " + times + " times ");
    return x;
}



public static String isValidEmail(String x){
    char at = '@';
    String end1 = ".com";
    String end2 = ".se";
    String end3 = ".gmail";

    int nr = x.length();
    for(int i = 0; i <=nr-1; i++ ){
     char a = x.charAt(i);
        if(a == at){
            System.out.println("You have an @ in your email. Good!");
        } 
    }
            if(x.contains(end1)){
            System.out.println("You have a valid end to your email " + end1);}
            
            else if (x.contains(end2)){
            System.out.println("You have a valid end to your email " + end2);}

            else if  (x.contains(end3)){
            System.out.println("You have a valid end to your email " +end3);}

            else{
                System.out.println("You do not have a valid email address!");
            }

     return x;
    }

  




}

