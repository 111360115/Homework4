
public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCarp11 rccar1;
		rccar1 = new RacingCarp11();
		
		rccar1.setCarp11(1234,20.5);
		rccar1.setCourse(5);
		rccar1.show();
		
	}

}
class Carp11
{
	protected int num;
	protected double gas;
	
	public Carp11()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCarp11(int n,double g)
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
class RacingCarp11 extends Carp11
{
	private int course;
	
	public RacingCarp11()
	{
		course = 0;
		System.out.println("生產了賽道");
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