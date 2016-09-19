import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Scanner;


public class POSClass {

	List<Double> pricing = Arrays.asList(100.0);
	//List<String> menu = new ArrayList<>();
	
	// the instance variable
	private ArrayList<POSClass> lineItems;	
	
	private Path filePath;

	public POSClass(String filePathString) {
		this.filePath = Paths.get(filePathString);
		lineItems = new ArrayList<>();
	}

	public POSClass() {
		this("src/menu.txt");
		
	}
	
	public double getSubTotal() {
		double subtotal = 0;
	    for(int i = 0; i < pricing.size(); i++)
	    {
	        subtotal += pricing.get(i);
	    }
	    return subtotal;
	}
	
	public double getTotal() {
		double invoiceTotal = 0;
		for(POSClass lineItem : lineItems) {
			invoiceTotal += lineItem.getTotal();
		}
		return invoiceTotal;
	}
	
	public double calculateSalesTax(double x) {
		double orderSalesTax = x * .06;
		return orderSalesTax;
	}
	
	public double formatSalesTax() {
		return calculateSalesTax(getSubTotal());
	}
	
	public double calculateGrandTotal() {
		return formatSalesTax() + getSubTotal();
	}

	public double calculateChange(double amountReceived) {
		double changeAmount = calculateGrandTotal()- amountReceived ;
		return changeAmount;
	}


	public List<String> readMenu() {
		List<String> foods = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return foods;
		}
		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);

			String line = reader.readLine();
			while (line != null) {
				foods.add(line);
				line = reader.readLine();
			}
			reader.close();
			return foods;
		} catch (IOException ex) {
			throw new RuntimeException("Unable to read menu.", ex);
		}
	}
	
}