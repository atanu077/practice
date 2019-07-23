
public class Lab410 {
	public static void main(String[] args) {
		//Hello04 h=new Hello04();
		//h.m1();
		Inter1 i=null;
		i=new Hello04();
		i.m1();
		System.out.println(i.a);
		int c;
		Hello04.a;
		
	}

}
interface Inter1{
	void m1();
	int a=10;
	public final int b=20;
}
  class Hello04 implements Inter1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello-----------m1()");
	}
	
}
