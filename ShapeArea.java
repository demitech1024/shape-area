import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        do {
           System.out.print("Enter a shape: ");
            String shape = in.next().toLowerCase();
            in.nextLine(); 
        } while (!(shape.equals("circle") || shape.equals("rectangle") || shape.equals("square") || shape.equals("triangle")));
        


        in.close()
    }
}