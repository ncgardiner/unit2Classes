public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      double milk = 5.5; // gallons
      double jarCapacity = 0.75; // gallons
      double completelyFilledJars = milk / jarCapacity;
      int completelyFilledJars2 = (int) completelyFilledJars;
      System.out.println(completelyFilledJars);
      System.out.println("Fixed:");
      System.out.println(completelyFilledJars2);
   }
}