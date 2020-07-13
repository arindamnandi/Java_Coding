// Ratio of chainring and cog using OOP 

class Gear {
	int chainring, cog;
	Gear(int chainring, int cog)
	{
		this.chainring = chainring;
		this.cog = cog;
	}
	double ratio()
	{
		return (double)chainring/cog;
	}
}


public class my_class2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( new Gear(52, 11).ratio());
		System.out.println( new Gear(30, 27).ratio());
		
	}

}
