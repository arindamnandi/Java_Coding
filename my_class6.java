import RevealingReferences.Wheel;

class Gear4
{
	double chainring, cog;
	Wheel obj;
	Gear(double chainring,double cog,double rim, doble tire)
	{
		this.chainring = chainring;
		this.cog = cog;
		obj = new Wheel(rim,tire);
	}
	double gear_inches()
	{
		return ratio * obj.diameter();
	}
}
public class my_class6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gear4 obj = new Gear(52, 11, 26, 1.5)
		obj.gear_inches()
	}

}
