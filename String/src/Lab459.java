
public class Lab459 {
public static void main(String[] args) {
	String s1="KBC";
	String s2=new String("KBC");
	String s3=s1.intern();
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s2==s3);
	System.out.println("-------------");
	String s4="OK".intern();
	String s5="OK";
	System.out.println(s4==s5);
			}
}
