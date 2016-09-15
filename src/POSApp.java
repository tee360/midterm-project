import java.util.List;

public class POSApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		POSClass foods = new POSClass();
		List<String> listOfFoods = foods.readMenu();
			 for (String lineList : listOfFoods)
				 System.out.println(lineList);

	}

}
