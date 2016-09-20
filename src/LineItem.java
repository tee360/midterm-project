import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class LineItem {

	private POSProducts product;
	private int quantity;

	public LineItem(POSProducts product, int quantity) {
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

	public POSProducts getProduct() {
		return product;
	}

	public void setProduct(POSProducts product) {
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
