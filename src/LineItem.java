import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class LineItem {

	private POSProduct product;

	// the instance variable
	private int quantity;

	// List<String> menu = new ArrayList<>();

	// private ArrayList<POSClass> lineItems;

	public LineItem() {
		this.product = null;
		this.quantity = 0;
	}

	public LineItem(POSProduct product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public POSProduct getProduct() {
		return product;
	}

	public void setProduct(POSProduct product) {
		this.product = product;
	}

	public double getTotal() {
		double total = quantity * product.getPrice();
		return total;
	}

	public String getTotalFormatted() {
		double total = this.getTotal();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String totalFormatted = currency.format(total);
		return totalFormatted;
	}

}
