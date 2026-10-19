import java.util.Scanner;
public class Test4_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = 6 * side * side / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %.2f" , area);
    }
}
