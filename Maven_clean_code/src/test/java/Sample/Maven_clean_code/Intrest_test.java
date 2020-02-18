package Sample.Maven_clean_code;
import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Intrest_test extends TestCase {
	
	Simple_Intrest object1=new Simple_Intrest();
	Compound_Interest object2= new Compound_Interest();
	
	@Test
	public void test() {
		
		double result=object1.calculate_simple_interest(10000.00,10,8.000);
		assertEquals(result,8000.0);
	}
	
	@Test
	public void test2() {		
		double result=object2.calculate_compound_interest(5000.00,10,0.05,12);
		assertEquals(result,8235.0474884514);
	}
	
Cost_Estimation object=new Cost_Estimation();
	
	@Test
	public void test3() {
		assertEquals(object.estimate(1),1200);
	}
	
	@Test
	public void test4() {
		assertEquals(object.estimate(2),1500);
	}
	
	@Test
	public void test5() {
		assertEquals(object.estimate(3),1800);
	}
	
	@Test
	public void test6() {
		assertEquals(object.estimate(4),2500);
	}
	
	

}
