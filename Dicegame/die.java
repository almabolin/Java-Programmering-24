package Dicegame;
import java.util.Random;

public class die {
    private int currentValue;
    private int sides = 6;
    private int randomValue;

//default constructor
public die(){
}

public die(int currentValue){
  this.currentValue = currentValue;
  this.sides = 6;
  Random randomValue = new Random();
  this.randomValue = randomValue.nextInt(7);
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
setValue(randomValue);

}

}
