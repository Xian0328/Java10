class Caaa
{
	public int num1;
	public int num2;
}
class Cbbb extends Caaa
{
	public void set_num(int x,int y)
	{
		num1=x;
		num2=y;
	}
	public void show()
	{
		System.out.println(num1);
		System.out.println(num2);
	}
}
public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb=new Cbbb();
		bb.set_num(5,10);
		bb.show();
	}

}
