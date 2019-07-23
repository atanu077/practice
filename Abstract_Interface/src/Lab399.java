
public class Lab399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Squere();
		s.area();

	}

}
abstract class Shape{
	abstract void area();
}
class Squere extends Shape{

	@Override
	void area() {
System.out.println("Squere--------------area()");		
	}
	
}
