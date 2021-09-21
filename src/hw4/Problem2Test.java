package hw4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import hw4.Problem2Class.Pods;
import hw4.Problem2Class.RRPvals;
import hw4.Problem2Class.RollProgram;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

	@RunWith(JUnitParamsRunner.class)
	public class Problem2Test 
	{ 	
		Problem2Class problem2 ;
		private RRPvals rrp_actual;
		private RollProgram rollprogram_actual;
		private Pods pods_actual;
	
		
		@Before
		public void setUp() throws Exception 
		{
			problem2 = new Problem2Class();	
		}	

		@Test
		@FileParameters("src/csv/Problem2TestCaseTable.csv")
		public void test(int testcase, double agl,RRPvals rrp_expected, RollProgram rollprogram_expected, Pods pods_expected, String basispath) {
			
			problem2.controlGravitos(agl);
			rrp_actual = problem2.getRrp();
		    rollprogram_actual = problem2.getRr();
		    pods_actual = problem2.getPods();
		    problem2.setPods(pods_expected);
		    problem2.setRr(rollprogram_expected);
		    problem2.setRrp(rrp_expected);
			assertTrue(rrp_expected.equals(rrp_actual));
			assertEquals(rollprogram_expected,rollprogram_actual);
			assertEquals(pods_expected,pods_actual);
		}
	}