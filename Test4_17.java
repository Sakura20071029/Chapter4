import java.util.Scanner;
public class Test4_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("Enter a month: ");
        String month = input.nextLine();
        char s = month.charAt(0);

        if(!Character.isUpperCase(s)){
            System.out.print(month + " is not correct month name");
            System.exit(0);
        }

        if((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            if (month.equals("Jan"))
                System.out.print("Jan " + year + " has 31 days");
            else if (month.equals("Feb"))
                System.out.print(month + " " + year + " has 29 days");
            else if (month.equals("Mar"))
                System.out.print(month + " " + year + " has 31 days");
            else if (month.equals("Apr"))
                System.out.print(month + " " + year + " has 30 days");
            else if (month.equals("May"))
                System.out.print(month + " " + year + " has 31 days");
            else if (month.equals("Jun"))
                System.out.print(month + " " + year + " has 30 days");
            else if (month.equals("Jul"))
                System.out.print(month + " " + year + " has 31 days");
            else if (month.equals("Aug"))
                System.out.print(month + " " + year + " has 31 days");
            else if (month.equals("Sep"))
                System.out.print(month + " " + year + " has 30 days");
            else if (month.equals("Oct"))
                System.out.print(month + " " + year + " has 31 days");
            else if (month.equals("Nov"))
                System.out.print(month + " " + year + " has 30 days");
            else if (month.equals("Dec"))
                System.out.print(month + " " + year + " has 31 days");
        }else{
                if(month.equals("Jan"))
                    System.out.print("Jan " + year + " has 31 days");
                else if(month.equals("Feb"))
                    System.out.print(month + " " + year + " has 28 days");
                else if(month.equals("Mar"))
                    System.out.print( month + " " + year + " has 31 days");
                else if(month.equals("Apr"))
                    System.out.print( month + " " + year + " has 30 days");
                else if(month.equals("May"))
                    System.out.print( month + " " + year + " has 31 days");
                else if(month.equals("Jun"))
                    System.out.print( month + " " + year + " has 30 days");
                else if(month.equals("Jul"))
                    System.out.print( month + " " + year + " has 31 days");
                else if(month.equals("Aug"))
                    System.out.print( month + " " + year + " has 31 days");
                else if(month.equals("Sep"))
                    System.out.print( month + " " + year + " has 30 days");
                else if(month.equals("Oct"))
                    System.out.print( month + " " + year + " has 31 days");
                else if(month.equals("Nov"))
                    System.out.print( month + " " + year + " has 30 days");
                else if(month.equals("Dec"))
                    System.out.print( month + " " + year + " has 31 days");
            }

    }
}
