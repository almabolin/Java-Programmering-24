package Dicegame;
import java.util.Random;

public class die {
    private int currentValue;
    private int sides = 6;
    private Random randomValue;

//default constructor
public die(){
}

public die(int sides){
  this.currentValue = 0;
  this.sides = sides;
  this.randomValue = new Random();
}
//Getter for sides
public int getSides() {
  return sides;
}


//Getter for value
public int getValue() {
    return currentValue;
  }
//Setter for value
  public void setValue(int newValue) {
this.currentValue = newValue;
  }
//Method for rolling
public void roll(){
this.currentValue = randomValue.nextInt(sides)+1;

}
}
