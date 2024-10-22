import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt;
        double favDouble;
        favInt = SafeInput.getInt(in, "What's your fav int?");
        favDouble = SafeInput.getDouble(in,"Whats your fave double?");
        System.out.println("\nYou said your fav int was " + favInt + " and your fav double was " + favDouble);

    }
}