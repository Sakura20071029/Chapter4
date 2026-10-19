import java.util.Scanner;
public class Test4_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ISBN(9 numbers): ");
        String number = input.nextLine();

        int num1 = number.charAt(0) - '0';
        int num2 = number.charAt(1) - '0';
        int num3 = number.charAt(2) - '0';
        int num4 = number.charAt(3) - '0';


        int num5 = number.charAt(4) - '0';
        int num6 = number.charAt(5) - '0';
        int num7 = number.charAt(6) - '0';
        int num8 = number.charAt(7) - '0';
        int num9 = number.charAt(8) - '0';

        int num10 = (num1 + num2 * 2 + num3 * 3 + num4 * 4 + num5 * 5 + num6 * 6 + num7 * 7 + num8 * 8 + num9 * 9) % 11;
        if(num10 == 10) {
            System.out.print("The ISBN-10 number is " + number + 'X');
        }else{
            System.out.print("The ISBN-10 number is " + number + num10);
        }


    }
}
