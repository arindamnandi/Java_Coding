// This code explaines dependencies
// A change in Wheel class will also create change in method
class Gear3 {
	int chainring, cog;
	int rim;
	double tire;
	
	Gear3(int chainring, int cog, int rim, double tire)
	{
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}
	public double gear_inches()
	{
		return ratio * Wheel.new(rim, tire).diameter
	}
}
public class my_class5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gear3 obj = new Gear3(52, 11, 26, 1.5);
		obj.gear_inches();
		
	}

}
