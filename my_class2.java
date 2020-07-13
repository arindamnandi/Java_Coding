// Passing object as an argument


class Gear {
	int chainring, cog;
	Wheel obj;
	Gear(int chainring, int cog, Wheel obj)
	{
		this.chainring = chainring;
		this.cog = cog;
		this.obj = obj
	}
	public double gear_inches()
	{
		
	}
}


public class my_class2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gear(52,11,new Wheel(26, 1.5)).gear_inches()
	}

}
