import java.util.Scanner;
public class Test4_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        double sides = input.nextDouble();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = sides * side * side / (4 * Math.tan(Math.PI / sides));
        System.out.print("The area of the polygon is " + area);
    }
}
