import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
    {
        //Input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle: ");
        String lengthString = in.next();
        System.out.print("Enter the width of the Rectangle: ");
        String widthString = in.next();
        //Convert input values to doubles
        double length = Double.parseDouble(lengthString);
        double width = Double.parseDouble(widthString);
        //Calculate the values
        double area = length*width;
        double perimeter = (length*2)+(width*2);
        double diagonal = Math.sqrt((length*length)+(width*width));
        //Print results
        System.out.println("The area of the rectangle is "+area);
        System.out.println("The perimeter of the rectangle is "+perimeter);
        System.out.println("The diagonal of the rectangle is "+diagonal);
    }
}