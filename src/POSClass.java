import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class POSClass {
	
	private Path filePath;

	public POSClass(String filePathString) {
		this.filePath = Paths.get(filePathString);
	}

	public POSClass() {
		this("src/menu.txt");
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
			throw new RuntimeException("Unable to read countries.", ex);
		}
	}

}
