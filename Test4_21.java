import java.util.Scanner;
public class Test4_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        String ssn1 = ssn.substring(0,4);
        String ssn2 = ssn.substring(4,6);
        String ssn3 = ssn.substring(7,11);

        if(Character.isDigit(ssn1.charAt(0)) && Character.isDigit(ssn1.charAt(1)) && Character.isDigit(ssn1.charAt(2)) && Character.isDigit(ssn1.charAt(3))) && Character.isDigit(ssn2.charAt(0)) && Character.isDigit(ssn2.charAt(1))    )

    }
}