package hw4;

public class Problem1Class {

	public double calcBill (double mthUsage) {
		double charges;
		if (mthUsage > 15_000.0)
			charges = 0.85 * (1_500.0 + .025*mthUsage);
		else
			if (mthUsage >= 10_000.0)
				charges = .9 * (1_250.0 + .0225*mthUsage);
			else
				if (mthUsage > 8_000.0)
					charges = (1_250.0 + .0225*mthUsage);
				else
					if (mthUsage >= 6_500.0)
						charges = 1_100.0 + .02*mthUsage;
					else 
						if (mthUsage > 5_000.0)
							charges = 950.0 + .015*mthUsage;
						else
							if (mthUsage >= 2_500.0)
								charges = 750.0 + .01*mthUsage;
							else
								if (mthUsage > 1_000.0)
									charges = 500.0 + .005*mthUsage;
								else
									charges = 250.0 + .0025*mthUsage;
		return charges*1.0825;			
	}
}