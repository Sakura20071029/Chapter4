import java.util.Scanner;
public class LotteryUsingStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if(lottery.equals(guess)){
            System.out.println("Exact match: you win $1000");
        }else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1){
            System.out.print("Match all digits: you win $3000");
        }else if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit2 ){
            System.out.print("Match one digit: you win $1000");
        }else{
            System.out.print("Sorry, no match");
        }
    }
}
