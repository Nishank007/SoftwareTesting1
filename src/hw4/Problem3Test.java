package hw4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import hw4.Problem3Class.landingState;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

	@RunWith(JUnitParamsRunner.class)
	public class Problem3Test 
	{ 
		Problem3Class problem3;
		
		@Before
		public void setUp() throws Exception 
		{
			problem3 = new Problem3Class();	
		}
		
		@Test
		@FileParameters("src/csv/Problem3TestCaseTable.csv")
		public void test(int testcase, boolean landEngaged,double altitude, double speed, landingState action_expected, String basispath, String comments) 
		{
			assertEquals(action_expected,problem3.landCraft(landEngaged, altitude, speed));
		}
	}