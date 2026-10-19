import java.util.Scanner;
public class Test4_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letter = input.nextLine();
        char result = letter.charAt(0);

        if(!Character.isLetter(result)){
            System.out.print("The input should be a letter");
            System.exit(0);
        }

        char output = Character.toUpperCase(result);
        if(output >= 'A' && output <= 'D')
            System.out.print("The numeric value for grade " + output + " is " + (69 - output));
        else if(output == 'F'){
            System.out.print("The numeric value for grade " + output + " is 0");
        }else{
            System.out.print(output + " is an invalid grade");
        }
    }
}
