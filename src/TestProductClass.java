import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestProductClass {
	
	
    final double MARGIN_OF_ERROR = .001;
    
    @Test
    public void whenAmountReceived10_00_GrandTotal8_60ExpectChangeAmount1_40(){    
        double grandTotal = 10.00;
        double amountReceived = 8.60;
        Assert.assertEquals(10.00, ChangeCalculator.calculateChange(grandTotal, amountReceived), MARGIN_OF_ERROR);
        
    }

//	@Test
//	public void whenItemIs1_00Quantity1Expect1_00(){
//		ArrayList<Double> price = new ArrayList<>();
//		ArrayList<Integer> quantity = new ArrayList<>();
//		
//		price.add(1.00);
//		quantity.add(1);
//		
//		Product tester = new Product(null, price);
//		
//		//Double lineTotal = tester.price.ge
//		Assert.assertEquals("1.0", (price.get(0) * quantity.get(0)));
//		
//	}

}
