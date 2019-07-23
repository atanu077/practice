import java.util.Scanner;

public class Lab460 {
	public static void main(String[] args) {
		String s1="KKR";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the KKR String");
		String s2=sc.nextLine();
		System.out.println("ReEnter the KKR String");
		String s3=sc.nextLine();
		String s4=s3.intern();
		String s5=s4.intern();
		System.out.println(s2==s3);
		System.out.println(s4==s5);
		System.out .println(s1==s5);
	}

}
