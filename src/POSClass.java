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
import java.util.Scanner;


public class POSClass {

//	public static final double subtotal = 0;
//
//	List<Double> pricing = Arrays.asList(1.39, 2.59, 7.32);
//	
	public double subtotal = 0;
	ArrayList<Double> pricing = new ArrayList<>();	
	private Path filePath;

	public POSClass(String filePathString) {
		this.filePath = Paths.get(filePathString);
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
	
	public double calculateSalesTax() {
		double orderSalesTax = this.subtotal * .06;
		return formatSalesTax(orderSalesTax);
	}
	
	private double formatSalesTax(double salesTax) {
		BigDecimal afterTax = new BigDecimal(salesTax);
		afterTax = afterTax.setScale(2, RoundingMode.HALF_UP);
		double formatted = afterTax.doubleValue();
		return formatted;
	}
	
	public double calculateGrandTotal() {
		return calculateSalesTax(subtotal) + getSubTotal();
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
