import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class POSClass {

	List<Double> pricing = Arrays.asList(1.39, 2.59, 7.32);
	
	private Path filePath;

	public POSClass(String filePathString) {
		this.filePath = Paths.get(filePathString);
	}

	public POSClass() {
		this("src/menu.txt");
		
	}
	
	public double getSubTotal() {
		double sum = 0;
	    for(int i = 0; i < pricing.size(); i++)
	    {
	        sum += pricing.get(i);
	    }
	    return sum;
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
