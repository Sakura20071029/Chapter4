import java.util.Scanner;
public class Test4_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        if(s.length() == 0){
            System.out.print("String is empty.");
            System.exit(0);
        }

        int length = s.length();
        char letter = s.charAt(0);
        System.out.print("The length of this string is " + length + " and the first letter is " + letter);
    }
}
