
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
		ArrayList<Double> theLastSubTotal = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Most Awesome Shop Ever!");
		System.out.println("Here's our menu: ");
		
		System.out.println();
		
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
			theLastSubTotal.add((double) thusSubTotal);
			System.out.println("SubTotal: " + theLastSubTotal);
			System.out.println("Continue shopping?");
			moreItems = sc.next();
			
	
			ShoppingBag classer = new ShoppingBag();
		
			
				int Total = (theLastSubTotal);
				double TaxTotal = (classer.calculateSalesTax(theLastSubTotal));	
			
			System.out.println("Grand Total: " + (Total + TaxTotal));
			
		
	}

	

}
