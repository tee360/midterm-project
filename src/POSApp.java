
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POSApp {


	public static void main(String[] args) {
		POSMenu menu = new POSMenu();
		POSProducts product = new POSProducts(null, null, null, 0);
		String moreItems = "y";
		// TODO Auto-generated method stub

		ArrayList<POSProducts> productList = new ArrayList<POSProducts>();
		ArrayList<Double> shoppingBag = new ArrayList<Double>();
		ArrayList<Integer> shoppingCartTotal = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Most Awesome Shop Ever!");
		System.out.println("Here's our menu: ");
		
		System.out.println();
		while (moreItems.equalsIgnoreCase("y")) {
			//printItems();
			menu.printItems();
			System.out.println();
			System.out.println("What would you like to order?");
			int itemChoice = sc.nextInt();
			System.out.println(menu.getItem(itemChoice).getName() + " at a price of " + menu.getItem(itemChoice).getFormattedPrice());
			System.out.println(menu.getItem(itemChoice).getDescription() + ". The category is: " + menu.getItem(itemChoice).getCategory());
			System.out.println("How many would you like?");
			int quantWanted = sc.nextInt();
			double thusSubTotal = menu.getSubTotal(quantWanted, itemChoice);
			shoppingCartTotal.add((int) thusSubTotal);
			double streamCart = 0;
			for (double num : shoppingCartTotal) {
				streamCart = streamCart + num;
			}
			POSProducts cartAmount = new POSProducts(moreItems, moreItems, moreItems, streamCart);
			 double Total = cartAmount.getPrice();
			System.out.println("SubTotal: " + Total);
			System.out.println("Continue shopping?");
			moreItems = sc.next();
			
		
		if (moreItems.equalsIgnoreCase("n")) {
			ShoppingBag classer = new ShoppingBag();
			double addTax = 0;
			double grandTotal = 0;
			
				addTax = (classer.calculateSalesTax(Total));
				grandTotal = (addTax) + Total;	
			
				System.out.println("Grand Total: " + (grandTotal));
				System.out.println("select payment type: cash, credit or check");
				String paymentType = sc.next();
			   	
		    		   
		        switch (paymentType) {
		            case "cash":
		                System.out.println("amount tendered");
		                double amountReceived = sc.nextDouble();
		                double calculateChange = ChangeCalculator.calculateChange(amountReceived, grandTotal);
		                System.out.println("Change Amount:" );
		                System.out.println(calculateChange);
		                
		                break;
		                
		            case "credit":    
		            	System.out.println("Please provide card number, expiration date (mm/yy) and 3 digit ccv no.");
		            	String cardNumber = sc.next();
		            //	System.out.println("Card no:" + cardNumber);
		            	
		            	String expDate = sc.next();
		            //	System.out.println("expiration date:" + expDate);
		            	
		            	String ccvNo = sc.next();
		            //	System.out.println("ccv no.:" + ccvNo);
		            	
		            	System.out.println("Card no:" + cardNumber);
		            	System.out.println("Expiration date (mm/yy):" + expDate);
		            	System.out.println("CCV no.:" + ccvNo);
		            	System.out.println("");
		            	
		            	break;
		            	
		     
		            case "check":
		            	System.out.println("Please provide check number");
		            	int checkNo = sc.nextInt();
		            	System.out.println("check no.:" + checkNo);
		            	break;
		            	
		            default:
		            	System.out.println("Invalid input. Must enter cash, credit or check");
		        }// end switch case
		        
		        System.out.println("Thank you for shopping with us! Have a Great Day!");
		}

		
        
	}//end while loop

} //end of Main
}//end of POSApp
