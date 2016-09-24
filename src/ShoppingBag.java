import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
/**
 * Responsibility: Track items selected
 * @author Thomas Martin
 *
 */
public class ShoppingBag {
	
	// the instance variable

	private LineItem itemSummary;

	public double runningTotal;
	
	// the constructor
	public ShoppingBag(LineItem itemSummary, double runningTotal) {
		this.itemSummary = itemSummary;
		this.runningTotal = runningTotal;
	}
	
	// a method that adds a line item
	public void addItem(LineItem lineItem) {
		itemSummary.add(lineItem);
	}	
	
	// the get accessor for the Line item collection
	public LineItem getLineItems() {
		return itemSummary;
	}
	
//	public double getSubTotal(int userQuantity, double itemPrice) {
//		return userQuantity * itemPrice;		
//	}
	
	// a method that gets the invoice total
	public double getTotal() {
		double invoiceTotal = 0;

		for(LineItem lineItem : itemSummary) {
			invoiceTotal += lineItem.getTotal();
		}
		return invoiceTotal;
	}
	
	// a method that returns the invoice total in currency format
	public String getTotalFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotal());
	}
	
	public double calculateSalesTax(double x) {
		double orderSalesTax = x * .06;
		return orderSalesTax;
	}	

	private double formatSalesTax(double salesTax) {
		BigDecimal afterTax = new BigDecimal(salesTax);
		afterTax = afterTax.setScale(2, RoundingMode.HALF_UP);
		double formatted = afterTax.doubleValue();
		return formatted;
	}
	
	public String calculateGrandTotal() {
		double formattedSalesTax = formatSalesTax(.06);
		return getTotalFormatted() + formattedSalesTax;
	}

}
