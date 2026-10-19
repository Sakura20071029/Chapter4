import java.util.Scanner;
public class Test4_11 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int value = input.nextInt();

        if(value >= 0 && value <= 10){
            System.out.print("The hex value is " + value);
        }else if (value <= 15){
            char result = (char)(value - 10 + 'A');
            System.out.print("The hex value is " + result);
        }else{
            System.out.print(value + " is an invalid input");
        }

    }
}
