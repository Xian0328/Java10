
class Caaa2
{
	private int num;
	public Caaa2(int n)
	{
		num=n;
	}
	public int get()
	{
		return num;
	}
}
class Cbbb2 extends Caaa2
{
	public Cbbb2(int n)
	{
		super(n);
	}
	public void show()
	{
		System.out.println("num="+get());
	}
}
public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb2 bb=new Cbbb2(2);
		bb.show();
	}

}
