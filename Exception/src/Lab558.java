
public class Lab558 {
	public static void main(String[] args) {
		System.out.println("main started");
		Hello555 h=new Hello555();
		h.show();
		System.out.println("main ensd!!");
		
	}
}
	class Hello555{
		int show(){
			int a=0;
		
		try{
			 a=10/4;
			System.out.println(a);
		return a;
		}
		catch(Exception e){
			 a=20;
				System.out.println(a);
			return a;
		}
		finally{
		System.out.println("finally ensd!!"+a);
		int arr[]=new int[-1];
		}
	}
	}
