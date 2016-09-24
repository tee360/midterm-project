import java.util.ArrayList;
import java.util.Scanner;

public class POSApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Most Awesome Dollar Store!");
		System.out.println("Here's our menu: ");
		System.out.println();

		ArrayList<POSProduct> posProdMenu = new ArrayList<>();
		/**
		 * // perform invoice calculations until choice isn't equal to "y" or "Y"
		 */
		String moreItems = "y";
		while (!moreItems.equalsIgnoreCase("n")) {
			
			/**
			 * Method call reads in menu from file and populates list
			 * Enhanced for loop displays list
			 */
			posProdMenu = POSMenu.readFromFile();
			for (int i = 0; i < posProdMenu.size(); i++) {
				System.out.println((i+1) +". " + posProdMenu.get(i));
			}

			System.out.println("\nWhat would you like to order? (Choose by line number)");
//			String selection = "Enter Selection: ";
//			numChoice = Validator.getInt(sc, selection, 1, 2);
			int itemChoice = sc.nextInt();			
			//System.out.println(posProdMenu.get(itemChoice - 1));
			
			System.out.println("How many would you like?");
			int quantWanted = sc.nextInt();
			
			LineItem itemSelection = new LineItem((posProdMenu.get(itemChoice - 1)), quantWanted);
			System.out.println("You have selected: " + quantWanted + " " +itemSelection.getProduct().getName());
			
			System.out.println("Your total so far is: " +itemSelection.getTotalFormatted());
			
			//ShoppingBag(POSProduct);
			
//			double streamCart = posProdMenu.get(itemChoice).getPrice();
//			double thusSubTotal = posProdMenu.getTotal(quantWanted,
//			streamCart);
//			shoppingCartTotal.add((int) thusSubTotal);
//			//POSProducts cartAmount = new POSProducts(moreItems, moreItems,
//			moreItems, streamCart);
//			// LineItem item = new LineItem(cartAmount, quantWanted);
//			// int quant = item.getQuantity();
//			
//			int i;
//			double sum = 0;
//			for(i = 0; i < shoppingCartTotal.size(); i++) {
//			sum += shoppingCartTotal.get(i);
//			}
//			
//			 System.out.println("SubTotal: " + sum);
//			 System.out.println("Continue shopping?");
//			 moreItems = sc.next();
			
			
			 System.out.println("Continue shopping? (y/n)");
			 moreItems = sc.next();
			
//			 if (moreItems.equalsIgnoreCase("n")) {
//			 ShoppingBag classer = new ShoppingBag();
//			 double addTax = 0;
//			 double grandTotal = 0;
//			
//			 addTax = (classer.calculateSalesTax(sum));
//			 grandTotal = (addTax) + sum;
//			
//			 System.out.println("Grand Total: " + (grandTotal));
//			 System.out.println("select payment type: cash, credit or check");
//			 String paymentType = sc.next();
//			
//			
//			 switch (paymentType) {
//			 case "cash":
//			 System.out.println("amount tendered");
//			 double amountReceived = sc.nextDouble();
//			 double calculateChange =
//			 ChangeCalculator.calculateChange(amountReceived, grandTotal);
//			 System.out.println("Change Amount:" );
//			 System.out.println(calculateChange);
//			
//			 break;
//			
//			 case "credit":
//			 System.out.println("Please provide card number, expiration date
//			 (mm/yy) and 3 digit ccv no.");
//			 String cardNumber = sc.next();
//			 // System.out.println("Card no:" + cardNumber);
//			
//			 String expDate = sc.next();
//			 // System.out.println("expiration date:" + expDate);
//			
//			 String ccvNo = sc.next();
//			 // System.out.println("ccv no.:" + ccvNo);
//			
//			 System.out.println("Card no:" + cardNumber);
//			 System.out.println("Expiration date (mm/yy):" + expDate);
//			 System.out.println("CCV no.:" + ccvNo);
//			 System.out.println("");
//			
//			 break;
//			
//			
//			 case "check":
//			 System.out.println("Please provide check number");
//			 int checkNo = sc.nextInt();
//			 System.out.println("check no.:" + checkNo);
//			 break;
//			
//			 default:
//			 System.out.println("Invalid input. Must enter cash, credit or
//			 check");
//			 }// end switch case
//			
			System.out.println("Thank you for shopping with us! Have a Great Day!");
		//}

		}// end while loop

		sc.close();
	} // end of Main
}// end of POSApp
