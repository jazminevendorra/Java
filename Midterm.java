/*
Jazmin Even Dorra
Midterm Exam

This program will ask the user for an amount to invest, and calculate the interest rate according to the amount, and the total after one year.
*/
import java.util.Scanner;

public class Midterm
{
public static void main( String[] args )
{
    Scanner in = new Scanner( System.in );
    double interest = 0.00 , amount;
    
    // Ask the user to enter the number of packages purchased.
    System.out.print("How much do you want to invest($)?: ");
    amount = in.nextDouble();
    
    // Exception handling
    while (amount < 20000)
    {
        System.out.println("Error ... The minimum investment is $20000.00");
		System.out.print("How much do you want to invest($)?: ");
    	amount = in.nextDouble();
	}
	
	// Determine the discount percentage.
    if (amount >= 20000 && amount <= 49999.99)
    {
        interest=0.15;
	}
    if (amount >= 50000 && amount <= 99999.99)
    {
        interest=0.2;
	}
    if (amount >= 100000 && amount <= 199999.99)
    {
        interest=0.25;
    }
    if (amount >= 200000)
    {
        interest=0.3;
    }

	// Calculate interest and and total
    double finalInterest = amount * interest;
    double total = amount + finalInterest;

	// Display results
	System.out.println("\nAfter one year, the bank is going to give you: ");
	System.out.println("\tInvestment: $" + String.format("%.2f",amount)); 
    System.out.println("\tIntesrest $" + String.format("%.2f",finalInterest));
    System.out.println("\tTotal: $" + String.format("%.2f",total));
	}
}