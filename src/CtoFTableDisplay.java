public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        SafeInput.prettyHeader("CtoF Table","*");
        System.out.println();
        for(double c =-100; c<=100;c++)
        {
            double fah = CtoF(c);
            System.out.printf("%17sC:%5.2f\t\t\tF:%5.2f","",c,fah);
            System.out.println();

        }
    }
    public static double CtoF(double Celsius)
    {
        double retVal;
        return retVal = (Celsius*9.0/5.0)+32;
    }
}
