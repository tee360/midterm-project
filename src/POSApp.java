
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POSApp {
	private static List<POSProducts> itemList;
	/**public static POSProducts[] products = new POSProducts[] {
			new POSProducts("Item 1", "Category1", "Description1", 1.00),
			new POSProducts("Item 2", "Category2", "Description2", 2.00),
			new POSProducts("Item 3", "Category3", "Description3", 3.00),
			new POSProducts("Item 4", "Category4", "Description4", 4.00),
			new POSProducts("Item 5", "Category5", "Description5", 5.00),
			new POSProducts("Item 6", "Category6", "Description6", 6.00),
			new POSProducts("Item 7", "Category7", "Description7", 7.00),
			new POSProducts("Item 8", "Category8", "Description7", 8.00),
			new POSProducts("Item 9", "Category9", "Description9", 9.00),
			new POSProducts("Item 10", "Category10", "Description10", 10.00),
			new POSProducts("Item 11", "Category11", "Description11", 11.00),
			new POSProducts("Item 12", "Category12", "Description12", 12.00), };
**/
	public static void main(String[] args) {
		POSProducts product;
		// TODO Auto-generated method stub
	
		ArrayList<POSProducts> productList = new ArrayList<POSProducts>();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Most Awesome Shop Ever!");
		System.out.println("Here's our menu: ");
		System.out.println();
		//itemList = new POSClass().readMenu();
		itemList = new ItemListMock().getListOfItems();
		 for(int i = 0; i < itemList.size(); i++)
		    {
		POSProducts newitemList = itemList.get(i);
		
		System.out.println(newitemList.getName()); }
		 System.out.println();
		 System.out.println("What would you like to order?");
			int itemChoice = sc.nextInt();
			int itemIndex = itemChoice - 1;
			product = itemList.get(itemIndex);
			System.out.println(product.getName() + " at a price of " + product.getPrice());
			System.out.println("How many would you like?");
			int quantWanted = sc.nextInt();
			double priceQuantity = ((product.getPrice()) * (quantWanted));
			System.out.println(priceQuantity);
			
		/**
		 * yg added code to calculate state sales tax depending on users state
		 * of residence
		 
		System.out.println("We have three great locations to serve you. Please enter your state MI, AL, IL");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Michigan");
		System.out.println("2. Illinois");
		System.out.println("3. Alabama");

		int userState = sc.nextInt();
		double salesTaxRate = 0.00;
		
		switch (userState) {

		case 1:
			salesTaxRate = .06;
			System.out.println("Michigan");
			break;

		case 2:
			salesTaxRate = 10.25;
			System.out.println("Illinois");
			break;

		case 3:
			salesTaxRate = 8.97;
			System.out.println("Alabama");
			break;

		default:
			System.out.println("Invalid input. Must enter a number from 1 to 3");
			
		}// end switch case
		
	
		//	POSClass st = new POSClass();
		//  st.calculateSalesTax(salesTaxRate);
		//	calculatedSalesTax = calculateSalesTax(salesTaxRate);
		/**
		 * yg added code to calculate state sales tax depending on users state
		 * of residence
		 */
/**
		POSClass foods = new POSClass();
		List<String> listOfFoods = foods.readMenu();
		for (String lineList : listOfFoods)
			System.out.println(lineList); 
		System.out.println();
		System.out.println("What would you like to order?");
		int itemChoice = sc.nextInt();
		int itemIndex = itemChoice - 1;
		product = products[itemIndex];
		System.out.println(product.getName() + " " + product.getCategory() + " " + product.getDescription() + " "
				+ product.getFormattedPrice());
		// System.out.println(foods.calculateGrandTotal());
**/
	}
	private static void printItems() {
		for (POSProducts truck : itemList) {

			System.out.println(truck);

		}

	}

}

