import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class POSMenu {
	
	private ArrayList<POSProduct> getListOfItems() {
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
	
	public static ArrayList<POSProduct> readFromFile() {
		ArrayList <POSProduct> posProdMenu = new ArrayList<>();
		Path filePath = Paths.get("src/menu.txt");
		
		if (!Files.exists(filePath)) {
			return posProdMenu;
		}
		
		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
		 
			String line = reader.readLine();
			while (line != null) {
				String[] newline = line.split("\t"); 
				
				String thing1 = newline[0];
				String thing2 = newline[1];
				String thing3 = newline[2];
				String thing4 = newline[3];
				
				double thg4 = Double.parseDouble(thing4);
				
				posProdMenu.add(new POSProduct(thing1, thing2, thing3, thg4));
				System.out.println();
				line = reader.readLine();
			}
			
			reader.close();
			return posProdMenu;
		} catch (IOException ex) {
			throw new RuntimeException("Unable to read food trucks.", ex);
		}
		
	}
	
	private List<POSProduct> items = getListOfItems();
	
	public void printItems() {
		for (POSProduct item : items) {
			System.out.println(item.getName());
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
