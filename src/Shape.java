//ShapeŬ������ �߻�ȭ��Ű�� Drawable�� �����Ѵ�.
public abstract  class Shape implements Drawable {
	double Area;
	double Length;
	double a,b,c,d;
	public Shape(double a,double b) {//Shape �� constructor ����
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	double getArea() {//Area�� ����������ϴ� getArea method ����
		return this.Area;
	}
	double getLength() {//Length�� ��������ε��´� getLength method����
		return this.Length;
	}
}
