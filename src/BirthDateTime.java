import java.sql.SQLOutput;
import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int min = 0;
        year = SafeInput.getRangedInt(in, "Enter your birth year",1950,2015);
        month  = SafeInput.getRangedInt(in, "Enter your birth month",1,12);

        switch(month)
        {
            case 2:
                day = SafeInput.getRangedInt(in,"Enter your day of birth",1,29);

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in,"Enter your day of birth",1,30);
                break;
            case 1:
            case 3:
            case 5:

            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in,"Enter your day of birth",1,31);
                break;
        }
        hour = SafeInput.getRangedInt(in, "Enter the hour of the day you were born", 0,23);
        min = SafeInput.getRangedInt(in,"Enter the minute of the hour for when you were born",0,59);
        System.out.println("\nYou were born in " + year + " on the " + day + " day of the " + month + " month at " + hour + ":" + min);
    }
}

