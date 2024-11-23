
public class p41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carp41 car1p41 = new Carp41(1234,20.5);
		car1p41.vshow();
		car1p41.mshow();
	}
}
interface iVehiclep41
{
	void vshow();
}
interface iMaterial
{
	void mshow();
}

class Carp41 implements iVehiclep41,iMaterial
{
	protected int num;
	protected double gas;
	public Carp41(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	public void vshow()
	{
		System.out.println("車號是"+ num);
		System.out.println("汽油量是"+ gas);
		
	}
	public void mshow()
	{
		System.out.println("車子的材質是鐵");
	}
}