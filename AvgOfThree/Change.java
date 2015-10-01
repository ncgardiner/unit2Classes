import java.util.Scanner;
public class Change
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How much was the purchase? (in pennies) ");
        String dueString = in.next();
        System.out.print("How much was already paid? (in pennies) ");
        String paidString = in.next();
        int due = Integer.parseInt(dueString);
        int paid = Integer.parseInt(paidString);
        int change = -(due-paid);
        
        int dollars=0;
        int quarters=0;
        int dimes=0;
        int nickels=0;
        int pennies=0;
        
        dollars = change/100;
        change = change%100;
        quarters = change/25;
        change = change%25;
        dimes = change/10;
        change = change%10;
        nickels = change/5;
        pennies = change%5;
        
        System.out.println("Dollars due: "+dollars);
        System.out.println("Quarters due: "+quarters);
        System.out.println("Dimes due: "+dimes);
        System.out.println("Nickels due: "+nickels);
        System.out.println("Pennies due: "+pennies);
    }
}




















