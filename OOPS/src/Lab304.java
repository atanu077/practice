
public class Lab304 {
	public static void main(String[] args) {
		Hello6 h=new Hello6();
		h.show("hi");
		//h.show(null);
		h.show(h);
	}

}
class Hello6{
	void show(String str){
		System.out.println("str");
		
	}
	void show(Hello h){
		System.out.println("hlw");
		
	}
	void show(Object str){
		System.out.println("obj");
	}
}
