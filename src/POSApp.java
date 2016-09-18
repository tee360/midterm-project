
import java.util.List;
import java.util.Scanner;

public class POSApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Most Awesome Shop Ever!");
		System.out.println("Here's our menu: ");
		System.out.println();

		/**
		 * yg added code to calculate state sales tax depending on users state
		 * of residence
		 */
		System.out.println("We have three great locations to serve you. Please enter your state MI, AL, IL");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Michigan");
		System.out.println("2. Illinois");
		System.out.println("3. Alabama");

		int userState = sc.nextInt();
		double salesTaxRate = 0.00;
		
		switch (userState) {

		case 1:
			salesTaxRate = .06;
			System.out.println("Michigan");
			break;

		case 2:
			salesTaxRate = 10.25;
			System.out.println("Illinois");
			break;

		case 3:
			salesTaxRate = 8.97;
			System.out.println("Alabama");
			break;

		default:
			System.out.println("Invalid input. Must enter a number from 1 to 3");
			
		}// end switch case
		
	
		//	POSClass st = new POSClass();
		//  st.calculateSalesTax(salesTaxRate);
		//	calculatedSalesTax = calculateSalesTax(salesTaxRate);
		/**
		 * yg added code to calculate state sales tax depending on users state
		 * of residence
		 */

		POSClass foods = new POSClass();
		List<String> listOfFoods = foods.readMenu();
		for (String lineList : listOfFoods)
			System.out.println(lineList);
		System.out.println();

		System.out.println("What would you like to order?");
		System.out.println(foods.calculateGrandTotal());

	}// end of public class 

//	private static void calculateSalesTax(double salesTaxRate) {
		// TODO Auto-generated method stub
		
//	}

	
}// end of static method main
