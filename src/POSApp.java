import java.util.List;

public class POSApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Most Awesome Shop Ever!");
		System.out.println("Here's our menu: ");
		System.out.println();
		POSClass foods = new POSClass();
		List<String> listOfFoods = foods.readMenu();
			 for (String lineList : listOfFoods)
				 System.out.println(lineList);
			 System.out.println();
			 System.out.println("What would you like to order?");
			 System.out.println(foods.getSubTotal());
	}

}
