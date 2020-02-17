package Sample.Maven_clean_code;
import java.util.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Intrest_test extends TestCase {
	
	Simple_Intrest object1=new Simple_Intrest();
	Compound_Interest object2= new Compound_Interest();
	
//	@Before
//	public void initialize()
//	{
//		object1=new Simple_Intrest();
//		object2 = new Compound_Interest();
//	}
//	
	@Test
	public void test() {
		
		double result=object1.calculate_simple_interest(10000.00,10,8.000);
		assertEquals(result,8000.0);
	}
	
	@Test
	public void test2() {
		//Age obj=new Age();
		
		double result=object2.calculate_compound_interest(5000.00,10,0.05,12);
		//result.setPrecision(2);
		assertEquals(result,8235.0474884514);
	}
	
	

}
