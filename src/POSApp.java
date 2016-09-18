import java.util.List;
import java.util.Scanner;

public class POSApp {
	public static POSProducts[] products = new POSProducts[] {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POSProducts product;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Most Awesome Shop Ever!");
		System.out.println("Here's our menu: ");
		System.out.println();
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

	}

}
