//Circle class는 Shape class를 상속받는다
public class Circle extends Shape {
	public Circle(double a,double b,double c) {//생성자 생성
		super(a,b);//Shape의 생성자를 불러와서 값지정.
		this.c= c;
	}
	public void draw() {//draw method를 오버라이드한다.
		// TODO Auto-generated method stub
		System.out.println("Circle center"+"("+a+","+b+")"+"-"+"radius"+"("+c+")");
		
	}
	double getArea() {//getArea메소드를 오버라이드한다.
		this.Area = c*c*3.14;
		return this.Area;//계산된 Area값 리턴
	}
	double getLength() {//getLength메소드를 오버라이드한다.
		this.Length= 2*c*3.14;
		return this.Length;
	}
}
