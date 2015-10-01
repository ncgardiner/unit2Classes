import java.util.Scanner;
public class NumberNicinator
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ten digit phone number: ");
        String num = in.next();
        String sub1 = num.substring(0,3);
        String sub2 = num.substring(3,6);
        String sub3 = num.substring(6,10);
        System.out.println("("+sub1+") "+sub2+"-"+sub3);
    }
}