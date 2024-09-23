package AlmaExercises.Exercises4;

public class Rectangle {
    public int length = 5;
    public int height = 2;

    public int calcAreaR(){
        int area = length * height;
        System.out.println("Area of rectangle is " + area);
        return area;
    }
    
    public double calcPerimeter(){
        double perimeter = (length + height) *2;
        System.out.println("The perimeter is " + perimeter);
        return perimeter;
    }
}
