
public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carp17 cars[];
		cars = new Carp17[2];
		
		cars[0] = new Carp17();
		cars[0].setCarp17(1234,20.5);
		
		cars[1] = new RacingCarp17();
		cars[1].setCarp17(4567,30.5);
		
		for (int i=0;i<cars.length;i++)
		{
			cars[i].show();
		}
		
	}

}
class Carp17
{
	protected int num;
	protected double gas;
	
	public Carp17()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCarp17(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}
class RacingCarp17 extends Carp17
{
	private int course;
	
	public RacingCarp17()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	public void show()
	{
		System.out.println("賽車的車號是"+ num);
		System.out.println("汽油量"+ gas);
		System.out.println("賽車編號"+course);
	}
}