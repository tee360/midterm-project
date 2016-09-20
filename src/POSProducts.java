import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class POSProducts {
		
	private String name;
	private String category;
	private String description;
	private double price;

	List<String> product = new ArrayList<String>();


	public POSProducts(String name, String category, String description, double price) {
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}
	
	public POSProducts(List<String> product) {
	this.product = product;
	}

	public String getName() {
		return getName();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return getCategory();
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return getDescription();
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return getPrice();
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	private String formatPrice(double x) {
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(2);
		return df.format(x);
	}

	public String getFormattedPrice() {
		return formatPrice(getPrice());
	}


	public double getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}