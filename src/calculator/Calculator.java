package calculator;

import static java.lang.Character.getNumericValue;
import static java.lang.Integer.max;
import static java.lang.Math.floor;
import java.util.Scanner;

public class Calculator
{
public static void main(String[] args)
{
    System.out.println("Hello and welcome to Angelino's calculator, where no number is too big!" + '\n');
    System.out.println("Please type the first number:");
    Scanner scan1 = new Scanner(System.in);
    String n1 = scan1.next();
    System.out.println("Please type the second number:");
    Scanner scan2 = new Scanner(System.in);
    String n2 = scan2.next();
    
    n1 = new StringBuffer(n1).reverse().toString();
    n2 = new StringBuffer(n2).reverse().toString();
    
    String result = "";
    
    int apotel = 0;
    int n1digit;
    int n2digit;

    for (int size = max(n1.length(), n2.length()); size > 0; size--)
    {
        n1digit = getNumericValue(n1.charAt(0));
        if (n1.length() <= 1)
        {
            n1 = "0";
        }
        n2digit = getNumericValue(n2.charAt(0));
        if (n2.length() <= 1)
        {
            n2 = "0";
        }

        apotel = n1digit + n2digit + apotel;
        result = Integer.toString(apotel % 10).concat(result);
        apotel = (int) floor(apotel / 10.0);

        if (n1.length() > 1)
        {
            n1 = n1.substring(1);
        }

        if (n2.length() > 1)
        {
            n2 = n2.substring(1);
        }
    }

    if (apotel != 0)
    {
        result = Integer.toString(apotel).concat(result);
    }
    
    System.out.println();
    System.out.println("When you add those numbers you get:" + '\n' + result);
    // TODO: Make this generic, add more than just addition.
}
}






























