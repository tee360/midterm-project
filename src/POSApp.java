
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POSApp {

	public static void main(String[] args) {
		POSMenu menu = new POSMenu();
		
		String moreItems = "y";
		// TODO Auto-generated method stub
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
			System.out.println(menu.getItem(itemChoice).getName() + " at a price of " + menu.getItem(itemChoice).getPrice());
			System.out.println(menu.getItem(itemChoice).getDescription() + ". The category is: " + menu.getItem(itemChoice).getCategory());
			System.out.println("How many would you like?");
			int quantWanted = sc.nextInt();
			double streamCart = menu.getItem(itemChoice).getPrice(); 
			double thusSubTotal = menu.getSubTotal(quantWanted, streamCart);
			shoppingCartTotal.add((int) thusSubTotal);
			//POSProducts cartAmount = new POSProducts(moreItems, moreItems, moreItems, streamCart);
			// LineItem item = new LineItem(cartAmount, quantWanted);
			// int quant = item.getQuantity();
			 int i;
			 double sum = 0;
			 for(i = 0; i < shoppingCartTotal.size(); i++) {
			     sum += shoppingCartTotal.get(i);
			 }
		
			System.out.println("SubTotal: " + sum); 
			System.out.println("Continue shopping?");
			moreItems = sc.next();
			
		
		if (moreItems.equalsIgnoreCase("n")) {
			ShoppingBag classer = new ShoppingBag();
			double addTax = 0;
			double grandTotal = 0;
			
				addTax = (classer.calculateSalesTax(sum));
				grandTotal = (addTax) + sum;	
			
				System.out.println("Grand Total: " + (grandTotal));
			
		}
	}

	}

}
