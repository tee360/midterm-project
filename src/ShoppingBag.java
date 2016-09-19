import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingBag {
	
	// the instance variable
	private ArrayList<POSClass> lineItems;
	
	// the constructor
	public ShoppingBag() {
		lineItems = new ArrayList<>();
	}
	
	// a method that adds a line item
	public void addItem(POSClass lineItem) {
		lineItems.add(lineItem);
	}
	
	// the get accessor for the Line item collection
	public ArrayList<POSClass> getLineItems() {
		return lineItems;
	}
	
	// a method that gets the invoice total
	public double getTotal() {
		double invoiceTotal = 0;
		for(POSClass lineItem : lineItems) {
			invoiceTotal += lineItem.getTotal();
		}
		return invoiceTotal;
	}
	
	// a method that returns the invoice total in currency format
	public String getTotalFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotal());
	}
}
