import java.util.ArrayList;
import java.util.List;

public class POSMenu {
	
	public ArrayList<POSProduct> getListOfItems() {
		ArrayList<POSProduct> items = new ArrayList<POSProduct>();
		items.add(new POSProduct("Item 1", "Category1", "Description1", 1.00));
		items.add(new POSProduct("Item 2", "Category2", "Description2", 2.00));
		items.add(new POSProduct("Item 3", "Category3", "Description3", 3.00));
		items.add(new POSProduct("Item 4", "Category4", "Description4", 4.00));
		items.add(new POSProduct("Item 5", "Category5", "Description5", 5.00));
		items.add(new POSProduct("Item 6", "Category6", "Description6", 6.00));
		items.add(new POSProduct("Item 7", "Category7", "Description7", 7.00));
		items.add(new POSProduct("Item 8", "Category8", "Description8", 8.00));
		items.add(new POSProduct("Item 9", "Category9", "Description9", 9.00));
		items.add(new POSProduct("Item 10", "Category10", "Description10", 10.00));
		items.add(new POSProduct("Item 11", "Category11", "Description11", 11.00));
		items.add(new POSProduct("Item 12", "Category12", "Description12", 12.00));
		return items;

	}
	private List<POSProduct> items = getListOfItems();
	
	public void printItems() {
		for (POSProduct item : items) {

			System.out.println(item.getName() + " " + item.getPrice() + " " + item.getDescription());
		}

	}
	
	public POSProduct getItem(int userSelection) {
		int itemIndex = userSelection - 1;
		return items.get(itemIndex);
		
	}
	
	public double getSubTotal(int userQuantity, double itemPrice) {
		return userQuantity * itemPrice;
		
	}
	
}
