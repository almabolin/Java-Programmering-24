package AlmaE3.Exercises4;

public class Circle {
    public int radius = 10;
    public int diameter = 20;

    public double calcArea(){
    double area = 3.14 * (radius*radius);
    System.out.println("Area of circle is " + area);
    return area;
    
    }

    public double calcCircumference(){
        double circumference = 3.14 * diameter;
        System.out.println("Circumference of circle is " + circumference);
        return circumference;
    }
    
}
