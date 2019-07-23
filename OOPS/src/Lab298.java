
public class Lab298 {
	public static void main(String[] args) {
		Hello3 h=new Hello3();
		//h.add(55, 66);
h.add("Hello", 444);
h.add(6565, "Hi");

	}

}
class Hello3{
	String add(int a,String b){
		System.out.println(a+b);
		return a+b;
	}
	String add(String a,int b){
		System.out.println(a+b);
		return a+b;
	}
	
}
