import java.util.Scanner;
public class FormatDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree: ");
        int degrees = input.nextInt();
        System.out.print("Enter a degree: ");
        int degrees1 = input.nextInt();

        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians" ,"Sine", "Cosine", "Tangent");


        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));


        radians = Math.toRadians(degrees1);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees1, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
