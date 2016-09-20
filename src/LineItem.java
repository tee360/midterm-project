import java.text.NumberFormat;

public class LineItem {

	private POSProduct product;
	private int quantity;

	public LineItem(POSProduct product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public LineItem(String name, int quantWanted) {
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
