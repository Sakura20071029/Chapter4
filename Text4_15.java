import java.util.Scanner;
public class Text4_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char result = letter.charAt(0);

        if(!Character.isLetter(result)){
            System.out.print(result + " is an invalid input");
            System.exit(0);
        }

        char output = Character.toLowerCase(result);
        if("abc".indexOf(output) != -1 ){
            System.out.print("The corresponding number is 2" );
        }else if("def".indexOf(output) != -1 ){
            System.out.print("The corresponding number is 3");
        }else if("ghi".indexOf(output) != -1 ) {
            System.out.print("The corresponding number is 4");
        }else if("jkl".indexOf(output) != -1 ) {
            System.out.print("The corresponding number is 5");
        }else if("mno".indexOf(output) != -1 ) {
            System.out.print("The corresponding number is 6");
        }else if("pqrs".indexOf(output) != -1 ) {
            System.out.print("The corresponding number is 7");
        }else if("tuv".indexOf(output) != -1 ) {
            System.out.print("The corresponding number is 8");
        }else if("wxyz".indexOf(output) != -1 ) {
            System.out.print("The corresponding number is 9");
        }


    }
}
