
public class p25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carp25 car1p25 = new Carp25();
		Carp25 car2p25 = new Carp25();
		
		Carp25 car3p25;
		car3p25 = car1p25;
		
		
		System.out.println("car1與car2相同"+car1p25.equals(car2p25));
		System.out.println("car1與car2相同"+car1p25.equals(car3p25));
	}
}
class Carp25
{
	protected int num;
	protected double gas;
	
	public Carp25()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
}
