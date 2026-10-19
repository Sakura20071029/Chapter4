import java.util.Scanner;
public class Test4_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an character: ");
        String character = input.nextLine();
        char s = character.charAt(0);

        int number = (int)s;
        System.out.print("The Unicode for the character " + character + " is " +number);





    }
}
