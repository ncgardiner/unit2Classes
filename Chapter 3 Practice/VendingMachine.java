

/**
 * It's a vending machine
 * @author  Nic G
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /**  */
    private int tokens;
    /**  */
    private int cans;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        tokens = 0;
        cans = 10;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     */
    public void fillUp(int inputCans)
    {
        cans += inputCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     */
    public void insertToken()
    {
        tokens += 1;
        cans -= 1;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     */
    public int getCanCount()
    {
        return cans;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     */
    public int getTokenCount()
    {
        return tokens;
    }
}
