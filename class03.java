class Caaa1
{
	public int num1;
	public int num2;
	public Caaa1()
	{
		num1=1;
		num2=1;
	}
	public Caaa1(int a,int b)
	{
		num1=a;
		num2=a;
	}
}
class Cbbb1 extends Caaa1
{
	public void set_num(int x,int y)
	{
		num1=x;
		num2=y;
	}
	public void show()
	{
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}
public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb1 bb=new Cbbb1();
		bb.set_num(5,10);
		bb.show();
	}

}
