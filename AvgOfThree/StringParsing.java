import java.util.Scanner;
public class StringParsing
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        //input
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String inputString = in.next();
        //Remove comma
        int length = inputString.length();
        int index = inputString.indexOf(",");
        String sub1 = inputString.substring(0,(length-4));
        String sub2 = inputString.substring((length-3),length);
        //print
        System.out.println(sub1+sub2);
    }
}