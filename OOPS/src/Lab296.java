
public class Lab296 {
	public static void main(String[] args) {
		Hello2 h=new Hello2();
		h.add(99, 12);
		byte b=40;
		h.add(b);
	}

}
class Hello2{
	int add(int a,int b){
		System.out.println(a+"\t"+b);
		return a+b;
	}
	void add(int a){
	System.out.println("void "+a);	
	}
	
}
