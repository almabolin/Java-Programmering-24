package AlmaExercises.Exercises4;

public class myMathMethods {

    public static void main(String[] args) {
       calculateFactorial(4);
       calculateFibonacci(0);
       isPrime(22);
        
    }

    //--------------------------------------------------------------------------------------------------------------------
    public static int calculateFactorial(int x){
        int sum = x;
        int y = x;
        for (int i = x; i>=2; i--){
        sum = sum * (i-1);    
        System.out.println("The factorial of " + y + " = " + sum);}
        return sum;
    }


    public static int calculateFibonacci(int x) {
        int sum = x;
        while (sum <2){
        sum = sum+1;
        System.out.println("The fibonacci number of " + x + " is " + sum);
        x++;
        }   
        for ( int i = x; i<10; i++){
         x = sum;
        sum = sum + (sum-1);
        System.out.println("The fibonacci number of " + x + " is " + sum);}
        return sum;
    }


   public static int isPrime(int x){
   if(x%2 != 0){
    System.out.println("Your number is a not prime number");
   }
   else{
    System.out.println("Your number is a prime number!");
   }
    return x;
   }

}
