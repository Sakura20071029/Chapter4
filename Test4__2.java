import java.util.Scanner;
public class Test4__2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        final double RADIUS = 6371.01;

        double distance = RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        System.out.println("The distance between the two points is " + distance + " km");
        input.close();
    }
}
