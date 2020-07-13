// Nested class
class RevealingReferences {
	
	Wheel wheels[];
	RevealingReferences (int[][] data)
	{
		wheels = wheelify(data);
	}
	
	public Wheel[] wheelify(int[][] data)
	{
			Wheel[] object = new Wheel[data.length];
			for(int i = 0; i < data.length; i++)
			{
				int[] cell = data[i];
				object[i] = new Wheel(cell[0],cell[1]);
				object[i].diameters();
				
			}
			return object;
	}
	class Wheel {
		int rim;
		int tire;
		int diameter;
		
		Wheel(int rim, int tire) {
			this.rim = rim;
			this.tire = tire;
			
		}

		void diameters(){
			this.diameter = this.rim + (this.tire * 2);
			System.out.println("The diameter is : " + this.diameter);
		}
	}
}
public class my_class4 {

	
	public static void PlayWithDoReferences()
	{
		int[][] data = { {622, 20}, {622, 23}, {559, 30}, {559, 40} };
			RevealingReferences obj = new RevealingReferences(data);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayWithDoReferences();
	}

}
