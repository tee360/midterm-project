import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class POSProduct {
		
	private String name;
	private String category;
	private String description;
	private double price;

	List<String> product = new ArrayList<String>();


	public POSProduct(String name, String category, String description, double price) {
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}
	
	public POSProduct(List<String> product) {
	this.product = product;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
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

	@Override
	public String toString() {
		return "Name: " + name + ",\tCategory: " + category 
				+ ",\t Desc: " + description + ",\t\t Price: "	
				+ price + "";
	}
	
	
}