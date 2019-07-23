
public class Lab408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Hai01 h=new Hai01(100);
		Hello01 h=new Hai01(99);

	}

}
abstract class Hello01{
	int a;
	Hello01(int a){
		this.a=a;
		System.out.println("Hello() cons");
		
	}
	
	void show(){
		System.out.println("Hello--------show()");
	}
}
class Hai01 extends Hello01{

	Hai01(int a) {
		
		
	super(a);
	System.out.println("Hao()cons");
		// TODO Auto-generated constructor stub
	}
	
}