
public class Lab156 {
	public static void main(String[] args) {
		B b=new B();
		//b.show(10);
		b.show("aa");
		
	}


}

class A{
	void show(int a){
		System.out.println(a);
	}
}
class B extends A{
//	void show(String s){
//		System.out.println(s);
		
		
	//}
	
	@Override
	void show(int a) {
		// TODO Auto-generated method stub
		super.show(a);
	}
}
