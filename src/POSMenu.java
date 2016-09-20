import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * The responsibility of this class is to keep track of all available items
 * 
 * @author thomas
 *
 */

public class PosMenu {

	private Path filePath;

	public PosMenu(String filePathString) {
		this.filePath = Paths.get(filePathString);
		//lineItems = new ArrayList<>();
	}

	public PosMenu() {
		this("src/menu.txt");
		
	}

	public ArrayList<POSProducts> getListOfItems() {
		ArrayList<POSProducts> items = new ArrayList<POSProducts>();
		items.add(new POSProducts("Item 1", "Category1", "Description1", 1.00));
		items.add(new POSProducts("Item 2", "Category2", "Description2", 2.00));
		items.add(new POSProducts("Item 3", "Category3", "Description3", 3.00));
		items.add(new POSProducts("Item 4", "Category4", "Description4", 4.00));
		items.add(new POSProducts("Item 5", "Category5", "Description5", 5.00));
		items.add(new POSProducts("Item 6", "Category6", "Description6", 6.00));
		items.add(new POSProducts("Item 7", "Category7", "Description7", 7.00));
		items.add(new POSProducts("Item 8", "Category8", "Description8", 8.00));
		items.add(new POSProducts("Item 9", "Category9", "Description9", 9.00));
		items.add(new POSProducts("Item 10", "Category10", "Description10", 10.00));
		items.add(new POSProducts("Item 11", "Category11", "Description11", 11.00));
		items.add(new POSProducts("Item 12", "Category12", "Description12", 12.00));

		return items;
	}

	public List<POSProducts> readMenu() {
		List<POSProducts> foods = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return foods;
		}
		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);

			String line = reader.readLine();
			while (line != null) {
				foods.add(null);
				line = reader.readLine();
			}
			reader.close();
			return foods;
		} catch (IOException ex) {
			throw new RuntimeException("Unable to read menu.", ex);
		}
	}

}
