import java.util.Scanner;
public class Test4_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String set1 = "1 3 5 7\n" + "9 11 13 15\n" +"17 19 21 23\n" + "25 27 29 31\n";
        String set2 = "2 3 6 7\n" + "10 11 14 15\n" +"18 19 22 23\n" +"26 27 30 31\n";
        String set3 = "4 5 6 7\n" + "12 13 14 15\n" + "20 21 22 23\n" +"28 29 30 31\n";
        String set4 = "8 9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" +"28 29 30 31\n";
        String set5 = "16 17 18 19\n" +"20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31\n";

        int day = 0;

        System.out.print("Is your birthday in set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter Y for yes and N for no: ");
        String answer1 = input.nextLine();
        char o1 = answer1.charAt(0);
        if(o1 == 'Y' )
            day += 1;

        System.out.print("Is your birthday in set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter Y for yes and N for no: ");
        String answer2 = input.nextLine();
        char o2 = answer2.charAt(0);
        if(o2 == 'Y' )
            day += 2;

        System.out.print("Is your birthday in set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter Y for yes and N for no: ");
        String answer3 = input.nextLine();
        char o3 = answer3.charAt(0);
        if(o3 == 'Y' )
            day += 4;

        System.out.print("Is your birthday in set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter Y for yes and N for no: ");
        String answer4 = input.nextLine();
        char o4 = answer4.charAt(0);
        if(o4 == 'Y' )
            day += 8;

        System.out.print("Is your birthday in set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter Y for yes and N for no: ");
        String answer5 = input.nextLine();
        char o5 = answer5.charAt(0);
        if(o5 == 'Y' )
            day += 16;

        System.out.println("Your birthday is " + day);
    }
}
