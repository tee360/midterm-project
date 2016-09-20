
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POSApp {


	public static void main(String[] args) {
		POSMenu menu = new POSMenu();
		POSProduct product = new POSProduct(null, null, null, 0);
		String moreItems = "y";
		// TODO Auto-generated method stub

		ArrayList<POSProduct> productList = new ArrayList<POSProduct>();
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
			POSProduct cartAmount = new POSProduct(moreItems, moreItems, moreItems, streamCart);
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
			
		}
	}

	}

}
