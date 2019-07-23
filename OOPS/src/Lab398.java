
public class Lab398 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A05 a=new B05();
		System.out.println(a.x);
		B05 b=new B05();
		System.out.println(b.x);

	}

}
class A05{
	int x=90;
}
class B05 extends A05{
	String x="Atanu";
}
