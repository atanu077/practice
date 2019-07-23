
public class Lab300 {
	public static void main(String[] args) {
		Hello4 h=new Hello4();
		byte b=20;
		h.add(b, b);
		h.add(98, b);
		
		
		
	}

}
class Hello4{
	void add(int a,int b){
		System.out.println("add(int,byte)"+a+"\t"+b);
	}
	
}
