//Rectangle class�� Shape class�� ��ӹ޴´�.
public class Rectangle extends Shape{
public Rectangle(double a,double b ,double c ,double d ) {//Rectangle ������ ����
	super(a,b);
	this.c=c;
	this.d=d;
	}

public void draw() {//draw method override
	// TODO Auto-generated method stub

	System.out.println("Rectangle"+"("+a+","+b+")"+"-"+"("+(a+c)+","+(b+d)+")");
	
	}
double getArea() {//getArea Override
	this.Area = c*d;
	return this.Area;
}
double getLength() {//getLength Override
	this.Length= 2*c+2*d;
	return this.Length;
}
}

