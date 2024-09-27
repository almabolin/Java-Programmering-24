package Dicegame;
import java.util.Scanner;

public class Dicegame {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("--------------------------------------------------------------------------");
    System.out.println("                    Welcome to Almas Dice Game!");
    System.out.println("--------------------------------------------------------------------------");
    System.out.println();

    System.out.println("How many rounds would you like to play?");
    int rounds = scan.nextInt();
    System.out.println("What is the name of the player?");
    String name = scan.next();

//Adding new players and dices
    player player1 = new player(name);

    //Tärningen slumpas inte om vid ny omgång
    int currentRound = 1;
    while(currentRound <= rounds){
        System.out.println("------------------------------Round " + currentRound + "-------------------------------------");
        System.out.println("Guess the number of the dice: ");
        int guess = scan.nextInt();
        player1.rollDice();
        player1.getDieValue();
        int result = player1.getDieValue();
        System.out.println("answer " + result);
    
            if (guess == result){
                System.out.println("You guessed correctly!");
                player1.increaseScore();
                System.out.println("You now have " + player1.getPoints() + " points!");
                
            }
                else{
                    System.out.println("Unfortunately it was the wrong answer, better luck next time!");
                    
                }
                currentRound++;
            }

    }


    }
    

