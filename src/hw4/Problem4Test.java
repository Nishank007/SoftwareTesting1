package hw4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import hw4.Problem4Class.Status;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

	@RunWith(JUnitParamsRunner.class)
	public class Problem4Test 
	{ 	
		Problem4Class problem4 ;
		
		@Before
		public void setUp() throws Exception 
		{
			problem4 = new Problem4Class();	
		}	

		@Test
		@FileParameters("src/csv/Problem4TestCaseTable.csv")
		public void test(int testcase, Status status, double cart, int creditRating, int points, boolean return_expected,String basispath, String comments) 
		{	
			assertEquals(return_expected,problem4.checkOut(status, cart, creditRating, points));
		}
	}