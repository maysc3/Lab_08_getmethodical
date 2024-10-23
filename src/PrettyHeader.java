import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SafeInput.prettyHeader("I hope this works", "*");
        System.out.println();
        SafeInput.prettyHeader("Hey this is cool","~");

    }
}
