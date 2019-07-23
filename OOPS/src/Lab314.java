
public class Lab314 {

	public static void main(String[] args) {
		Hello8 h=new Hello8();
		h.show(10, 20);
		h.show(60, 100,300,500);
		//h.m1();

	}

}
class Hello8{
	void show(int a,int...b){
		System.out.println("int,int"+a+"\t"+b);
	}
	void m1(int...a){
		System.out.println("int");
	}
	void m1(String...s){
		System.out.println("String");
	}
	void m1(int[] arr10){
		
	}
}
