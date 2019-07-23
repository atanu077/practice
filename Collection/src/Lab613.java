import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab613 {
	public static void main(String[] args) {
		
	
	List l=new LinkedList();
	
	l.add(10);
	l.add(66);
	l.add(47);
	l.add(78);
	l.add("Dil");
	l.add(12);
	l.add(12.45);
	l.add(true);
	l.add(null);
	
	System.out.println(l);
	Iterator it=l.iterator();
	
	while(it.hasNext()){
		System.out.println(it.next());
	}
	System.out.println("main end!!");
	

}
}
