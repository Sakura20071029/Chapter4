import java.util.Scanner;
public class Test4_8 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter an ASCII code(0-127): ");
        int number = input.nextInt();

        char character = (char)number;

        System.out.print("The character for ASCII  code " + number + " is " + character);



    }
}
