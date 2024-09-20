package AlmaE3;

public class Car {
    String make;
    String model;
    int year;
    String color;

//all parameters 
 Car (String model, String make, int year, String color) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
 }

//only 2 parameters, the rest default
  Car (String make, String model) {
    this(model, make, 2012, "white");
  }

  //no parameters
  Car () {
    this("volkswagen","passat",2016,"red");
  }

}
