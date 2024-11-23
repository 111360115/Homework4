
public class p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Carp29(1234,20.5);
		vc[0].setspeed(60);
		
		vc[1] = new Plane(234);
		vc[1].setspeed(500);
		
		for(int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}
	}

}

abstract class Vehicle
{
	protected int speed;
	public void setspeed(int s)
	{
		speed = s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class Carp29 extends Vehicle
{
	private int num;
	private double gas;
	
	public Carp29(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	public void show()
	{
		System.out.println("賽車的車號是"+ num);
		System.out.println("汽油量是"+ gas);
		System.out.println("速度是"+speed);
	}
}
class Plane extends Vehicle
{
	private int flight;
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}
