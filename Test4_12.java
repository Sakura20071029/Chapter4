import java.util.Scanner;
public class Test4_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char letter1 = letter.charAt(0);

        if(! Character.isLetter(letter1)){
            System.out.print(letter1 + " is an invalid input");
            System.exit(0);
        }

        char lowerLetter = Character.toLowerCase(letter1);

        if(lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' || lowerLetter == 'o' || lowerLetter == 'u'){
            System.out.print(letter1 + " is a vowel");
        }else{
            System.out.print(letter1 + " is a consonant");
        }
    }
}
