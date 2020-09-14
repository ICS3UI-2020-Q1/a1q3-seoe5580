import java.util.Scanner;

/**
 * Allows you to see the total amount of money that was spent for school supplies
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creat a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // Asks the user how many chromebook chargers they want
    System.out.println("How many chromebook chargers?");

    // Gets users input for the amount of chargers they want
    int charger = input.nextInt();

    // Asks the user how many motherboards they want
    System.out.println("How many motherboards?");

    // Gets users input for the amount of motherboards they want
    int motherboard = input.nextInt ();

    // Asks the user how many mice they want
    System.out.println("How many mice?");

    // Gets users input for the amount of mice they want
    int mice = input.nextInt ();

    // Calculates how much everything is without tax
    double subtotal = charger * 34.99 + motherboard * 127.50 + mice * 18.00;

    // Shows the subtotal
    System.out.println("Subtotal = $" + subtotal);

    // Calculates the taxes of the subtotal
    double taxes = 0.13 * subtotal;

    //shows the users the tax of your subtotal
    System.out.println("Taxes = $" + taxes);

    // Calculates the total
    double total = subtotal + taxes;

    // Shows the users the final amount
    System.out.println("Total = $" + total);

  }
}
