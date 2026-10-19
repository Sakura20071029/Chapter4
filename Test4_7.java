import java.util.Scanner;
public class Test4_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        double y1 = radius * Math.sin(Math.toRadians(18));
        double x1 = radius * Math.cos(Math.toRadians(18));

        double x2 = 0;
        double y2 = radius;

        double x3 = -x1;
        double y3 = y1;

        double x4 = -radius * Math.sin(Math.toRadians(36));
        double y4 = -radius * Math.cos(Math.toRadians(36));

        double x5 = radius * Math.sin(Math.toRadians(36));
        double y5 = -radius * Math.cos(Math.toRadians(36));

        System.out.printf("The coordinates of five points on the pentagon are\n(%.2f, %.2f)\n(%.2f, %.2f)\n(%.2f, %.2f)\n(%.2f, %.2f)\n(%.2f, %.2f)", x1, y1, x2, y2, x3, y3, x4, y4, x5, y5);
    }
}
