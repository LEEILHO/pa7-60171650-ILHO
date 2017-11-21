//60171650 ����ȣ 
public class ShapeTest1 {//test�� �ϱ����� class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[3];//3���� Shape��ü ����
		shapes[0] = new Rectangle(10, 20, 30, 40);//��ü ���� ����
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50,20,30);
		for(Shape s:shapes) {//Shape��ü�� ������ŭ for�� ����.
			System.out.printf("Area: %.1f\n", s.getArea());//getArea ���
			System.out.printf("Length: %.1f\n", s.getLength());//getLength ���
			}
		Drawable[] drawables = new Drawable[4];//4����Drawable ��ü ����
		for(int i =0;i< shapes.length;i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		for(Drawable d: drawables) {
			d.draw();
		}
		
		
	}

}