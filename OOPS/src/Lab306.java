import java.util.Scanner;

public class Lab306 {
	public static void main(String[] args) {
		System.out.println("main started ");
		Hello7 h=new Hello7();
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int fac=h.factorial(input);
		System.out.println(fac);
		
		
	}

}
class Hello7{
	int factorial(int x){
		if(x==0 || x==1){
			return 1;
		}
	
		return x* factorial(x-1);
	}
	
}
