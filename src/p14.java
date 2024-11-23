
public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RacingCarp14 rccar1;
		rccar1 = new RacingCarp14();
		rccar1.setCarp14(1234,20.5);
		rccar1.setCourse(5);
		rccar1.show();
		
	}

}
class Carp14
{
	protected int num;
	protected double gas;
	
	public Carp14()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCarp14(int n,double g)
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
class RacingCarp14 extends Carp14
{
	private int course;
	
	public RacingCarp14()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	public void newshow()
	{
		System.out.println("賽車的車號是"+ num);
		System.out.println("汽油量"+ gas);
		System.out.println("賽車編號"+course);
	}
}