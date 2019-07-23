import java.util.ArrayList;
import java.util.List;

public class Lab608 {
	public static void main(String[] args) {
	List l=new ArrayList<>();
	
	l.add(90);
	l.add(55);
	l.add(44);
	l.add(90);
	l.add(55);
	l.add(100);
	System.out.println(l);
	System.out.println(l.lastIndexOf(90));
	
	try{
	List l1=l.subList(2, 9);
	System.out.println(l1);
	}
	catch(Exception e)
	{
		//e.printStackTrace();
	}
	
	}

}
