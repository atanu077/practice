import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab615 {
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add(55);
		l.add(78);
		l.add(41);
		l.add(16);
		l.add("ap");
		
		Iterator it=l.iterator();
		//int size=l.size();
		l.remove("ap");
		for(int i=0;i<=l.size();i++){
			System.out.println(it.next());
		}
		System.out.println(l);
	}

}
