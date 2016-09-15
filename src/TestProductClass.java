import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TestProductClass {
	
	@Test
	public void whenItemIs1_00Quantity1Expect1_00(){
		ArrayList<Double> price = new ArrayList<>();
		ArrayList<Integer> quantity = new ArrayList<>();
		
		price.add(1.00);
		quantity.add(1);
		
		Product tester = new Product(null, price);
		
		//Double lineTotal = tester.price.ge
		Assert.assertEquals("1.0", (price.get(0) * quantity.get(0)));
		
	}

}
