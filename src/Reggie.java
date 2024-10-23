import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String mNum = "";
        String menu = "";

        SSN = SafeInput.getRegExString(in,"Enter your SSN","^\\d{3}-\\d{2}-\\d{4}$");
        mNum = SafeInput.getRegExString(in,"Enter your UC Mnumber", "^(M|m)\\d{5}$");
        menu = SafeInput.getRegExString(in,"Enter a menu choice", "^[OoSsVvQq]$");

        System.out.println();
        System.out.println("The SSN is " + SSN + ", the mnumber is " + mNum + " the menu choice is " + menu);
    }
}
