package hw4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

	@RunWith(JUnitParamsRunner.class)
	public class Problem5Test 
	{ 	
		Problem5Class problem5 ;
	
		@Before
		public void setUp() throws Exception 
		{
			problem5 = new Problem5Class();			
		}	

		@Test
		@FileParameters("src/csv/Problem5TestCaseTable.csv")
		public void test(int testcase, double x, double y_expected, String basispath) 
		{	
			assertEquals(y_expected,problem5.calcY(x),0.001);
		}
	}