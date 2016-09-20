import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestProductClass {
	
    final double MARGIN_OF_ERROR = .001;
    
    @Test
    public void whenAmountReceived10_00_GrandTotal8_60ExpectChangeAmount1_40(){    
        double amountReceived = 10.00;
        double grandTotal = 8.60;
        Assert.assertEquals(1.40, ChangeCalculator.calculateChange(amountReceived, grandTotal), MARGIN_OF_ERROR);
        
    }
    
    @Test
    public void whenAmountReceived8_60_GrandTotal10_60ExpectChangeAmountNeg2_00(){    
        double grandTotal = 10.60;
        double amountReceived = 8.60;
        Assert.assertEquals(-2.00, ChangeCalculator.calculateChange(amountReceived, grandTotal), MARGIN_OF_ERROR);
        
    }

   
//    @Test
//  public void whenGet8_60_GrandTotal10_60ExpectChangeAmountNeg2_00(){    
//        String getCategory = "Category13";
//        Assert.assertEquals("Category12", LineItem.(amountReceived, grandTotal), MARGIN_OF_ERROR);
//        
//    }
//    @Test
//    public void whenAmountReceived8_60_GrandTotal10_60ExpectChangeAmountNeg2_00(){    
//        double grandTotal = 10.60;
//        double amountReceived = 8.60;
//        Assert.assertEquals(-2.00, ChangeCalculator.calculateChange(amountReceived, grandTotal), MARGIN_OF_ERROR);
//        
//    }
//    
//    @Test
//    public void whenAmountReceived8_60_GrandTotal10_60ExpectChangeAmountNeg2_00(){    
//        double grandTotal = 10.60;
//        double amountReceived = 8.60;
//        Assert.assertEquals(-2.00, ChangeCalculator.calculateChange(amountReceived, grandTotal), MARGIN_OF_ERROR);
//        
//    }


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
//	@Test
//	public void whenItemIs1_00Quantity1Expect1_00(){
//		ArrayList<Double> price = new ArrayList<>();
//		ArrayList<Integer> quantity = new ArrayList<>();
//		
//		price.add(1.00);
//		quantity.add(1);
		
	//	Product tester = new Product(null, price);
		
		//Double lineTotal = tester.price.ge
	//	Assert.assertEquals("1.0", (price.get(0) * quantity.get(0)));
		
	//}

}
