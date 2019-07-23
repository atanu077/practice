
public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Hai hai=new Hai(50);
		Hello h1=new Hello(20, hai);
		Hello h2=(Hello)h1.clone();
		h1.show();
		h2.show();
		System.out.println(h1==h2);
		System.out.println(h1.hai==h2.hai);
		h2.y=99;
		System.out.println("----------------------------");
		h1.show();
		h2.show();
		System.out.println("================================");
		h2.hai.x=44;
		h1.show();
		h2.show();
		

	}

}
class Hai{
	int x;
	Hai(int x){
		this.x=x;
	}
}
class Hello implements Cloneable{
	int y;
	Hai hai;
	Hello(int y,Hai hai){
		this.y=y;
		this.hai=hai;
	}
	
	void show(){
		System.out.println(y);
		System.out.println(hai.x);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}