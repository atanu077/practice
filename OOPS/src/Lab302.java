
public class Lab302 {
	public static void main(String[] args) {
		Hello5 h=new Hello5();
		byte b=10;
		h.add(b, 35);
		//h.add(b, b);
		
	}

}
class Hello5{
	void add(byte a,int b){
		System.out.println("add(byte,int)");
		
	}
	void add(int a,byte b){
		System.out.println("add(int,byte)");
	}
}
