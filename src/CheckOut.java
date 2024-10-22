import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        double itemP;
        boolean scanning = true;
        double low;
        double high;

        do
        {
            itemP = SafeInput.getRangedDouble(in,"Enter the item price", low= .5,high = 10.00);
            total = total + itemP;
            scanning = SafeInput.getYNConfirm(in, "Do you have another item?");
        }while(scanning);
        System.out.println("\n Your total is " + total);
    }
}