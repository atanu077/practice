import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Lab610 {
	public static void main(String[] args) {
		Vector v=new Stack<>();
		Enumeration e=v.elements();
		if(e.hasMoreElements()){
		System.out.println(e.nextElement());
		}
		System.out.println("Main completed!!");
		
	}

}
