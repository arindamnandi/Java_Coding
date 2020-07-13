// Adding get_inces method and addind two instance variable rimand tire 
class Gear2 {
	int chainring, cog;
	int rim;
	double tire;
	
	Gear2(int chainring, int cog, int rim, double tire)
	{
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}
	
	double ratio()
	{
		return (double)chainring/cog;
	}
	
	double gear_inches()
	{
		
		return ratio() * (rim + (tire * 2));
	}
}

public class my_class3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (new Gear2(52, 11, 26, 1.5).gear_inches());
		System.out.println (new Gear2(52, 11, 24, 1.25).gear_inches());

	}

}
