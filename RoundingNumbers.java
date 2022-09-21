
/**
 * Write a description of class RoundingNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoundingNumbers
{
    public static void main(String[] args){
        double number = 11.0/5;
        
        int roundedNumber = (int)(number + 0.5);
        System.out.println("11.0 / 5 = "+number); //2.2
        System.out.println("11 / 5 = "+ (int)number); //2
        System.out.println("11.0 / 5 rounded is "+roundedNumber); //2
        
        //what about negative numbers?
        double neg = -number;
        int roundedNegNumber = (int)(neg - 0.5);
        System.out.println("-11.0 / 4 rounded is "+roundedNegNumber);
        
    }
}




