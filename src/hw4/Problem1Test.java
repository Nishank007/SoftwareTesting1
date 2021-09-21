package hw4;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1Test 
{
	private Problem1Class problem1;
	@SuppressWarnings("unused")
	private static final Object[] test_problem1() 
	{
		return $(
				$(0.00,270.63),
				$(1000.00,273.33),
				$(1000.01,546.66),
				$(2499.99,554.78),
				$(2500.00,838.94),
				$(5000.00,866.00),
				$(5000.01,1109.56),
				$(6499.99,1133.92),
				$(6500.00,1331.48),
				$(8000.00,1363.95),
				$(8000.01,1547.98),
				$(9999.99,1596.69),
				$(10000.00,1437.02),
				$(15000.00,1546.62),
				$(15000.01,1725.23),
				$(20000.00,1840.25)
				);
	}
	
	@Before
	public void setUp () {
		problem1 = new Problem1Class();
	}
	
	@Test
	@Parameters(method="test_problem1")
	public void Test(double usage,double totalprice_expected) 
	{
		assertEquals(totalprice_expected,problem1.calcBill(usage),0.006);
	
	}
}