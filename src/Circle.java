//Circle class�� Shape class�� ��ӹ޴´�
public class Circle extends Shape {
	public Circle(double a,double b,double c) {//������ ����
		super(a,b);//Shape�� �����ڸ� �ҷ��ͼ� ������.
		this.c= c;
	}
	public void draw() {//draw method�� �������̵��Ѵ�.
		// TODO Auto-generated method stub
		System.out.println("Circle center"+"("+a+","+b+")"+"-"+"radius"+"("+c+")");
		
	}
	double getArea() {//getArea�޼ҵ带 �������̵��Ѵ�.
		this.Area = c*c*3.14;
		return this.Area;//���� Area�� ����
	}
	double getLength() {//getLength�޼ҵ带 �������̵��Ѵ�.
		this.Length= 2*c*3.14;
		return this.Length;
	}
}
