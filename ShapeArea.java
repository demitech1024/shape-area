import java.util.Scanner;
import java.lang.Math;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String shape = "";
        double area = 0;
        System.out.println();

        do {
            System.out.print("Enter a shape: ");
            shape = in.next().toLowerCase();
            in.nextLine(); 
        } while (!(shape.equals("circle") || shape.equals("rectangle") || shape.equals("square") || shape.equals("triangle")));

        switch (shape) {
            case "circle":
                System.out.print("Enter a radius: ");
                double radius = in.nextDouble();
                in.nextLine();
                area = Math.PI * Math.pow(radius, 2);
                break;
        
            case "rectangle":
                System.out.print("Enter a length: ");
                double length = in.nextDouble();
                in.nextLine();
                System.out.print("Enter a width: ");
                double width = in.nextDouble();
                in.nextLine();
                area = length * width;
                break;
        
            case "square":
                System.out.print("Enter a side: ");
                double side = in.nextDouble();
                in.nextLine();
                area = side * side;
                break;
        
            case "triangle":
                System.out.print("Enter a base: ");
                double base = in.nextDouble();
                in.nextLine();
                System.out.print("Enter a height: ");
                double height = in.nextDouble();
                in.nextLine();
                area = (base * height) / 2;
                break;
        
            default:
                break;
        }

        System.out.printf("\nArea: %,.2f\n", area);
        


        in.close();
    }
}