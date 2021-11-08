class CShape
{
	private double area=0.0;
	private String str;
	public CShape(String id)
	{
		str=id;
	}
	protected void setArea(double area)
	{
		this.area=area;
	}
	public static void largest(CShape shape[])//(e)
	{
		double max=0 ; int fg=0;
		for(int i=0;i<shape.length;i++)
		{
			if(shape[i].area >max)
			{
				max=shape[i].area;
				fg=i;
			}
		}
		System.out.println(shape[fg].str+" has the largest area= "+shape[fg].area);
	}
}
class CCircle extends CShape//(a)
{
	private double pi=3.14;
	private int radius;
	public CCircle(int r)
	{
		super("Circle");
		radius=r;
		setArea(radius*radius*pi);
	}
}
class CSquare extends CShape//(b)
{
	private int width;
	public CSquare(int w)
	{
		super("Square");
		width=w;
		setArea(width*width);
	}
}
class CTriangle extends CShape//(c)
{
	private int base;
	private int height;
	public CTriangle(int b,int h)
	{
		super("Triangle");
		base=b;
		height=h;
		setArea(base*height/2.0);
	}
}
public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CShape shp[]=new CShape[3];
		shp[0]=new CCircle(6);//(d)
		shp[1]=new CSquare(15);//(d)
		shp[2]=new CTriangle(12,7);//(d)
		CShape.largest(shp);
	}

}
