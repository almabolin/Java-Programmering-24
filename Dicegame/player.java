package Dicegame;

public class player {
    private String name;
    private int points;
    private die dice;
//Default constructor
    public player(){
    }
    public player(String name){
        this.name = name;
        this.points = points;
        die dice = new die(0);
        this.dice = dice;
    }
//Getter for name
public String getName() {
    return name;
  }
//Setter for name
  public void setName(String newName) {
this.name = newName;
}
//Getter for points
public int getPoints() {
    return points;
  }
//Setter for points
  public void setPoints(int newPoints) {
this.points = newPoints;
}
public void rollDice(){
dice.roll();
}
public int getDieValue(){
    return dice.getValue();  
}
public void increaseScore(){
   this.points ++;
}
public void addDie(int sides){
    this.dice = new die(sides);
}
}