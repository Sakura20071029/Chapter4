import java.util.Locale;
import java.util.Scanner;
public class Test4_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String s = input.nextLine();
        String s1 = s.toUpperCase();
        char major = s1.charAt(0);
        char grade = s1.charAt(1);
        String majorName = " ";
        String gradeName = " ";

        if(major == 'M')
           majorName = "Mathematics";
        else if (major == 'C')
                majorName = "Computer Science";
            else if (major == 'I')
               majorName = "Information Technology";
            else {
                System.out.print("Invalid input");
                System.exit(0);
            }

                if(grade == '1')
                    gradeName =" Freshman";
                else if(grade == '2')
                    gradeName = " Sophomore";
                else if(grade == '3')
                    gradeName = " Junior";
                else if(grade == '4')
                    gradeName = " Senior";
                else {
                    System.out.print("Invalid input");
                    System.exit(0);
                }
                System.out.print(majorName + gradeName);

    }
}
