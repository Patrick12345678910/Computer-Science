
/**
 * Write a description of class TimesTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TimesTable
{
    public static void main(String args[])
    {
        int n1, n2;
        System.out.println("Enter an number to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        System.out.println("Multiplication table of "+n1+" is :-");

        for ( n2 = 1 ; n2 <= 10 ; n2++ )
            System.out.println(n1+"*"+n2+" = "+(n1*n2));
    }
}
