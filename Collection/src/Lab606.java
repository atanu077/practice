import java.util.ArrayList;
import java.util.List;

public class Lab606 {
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add(0, "durga");
		l.add("Atanu");
		l.add("Raja");
		l.add("Java");
		
		l.add(2, 10);
		
		System.out.println(l);
		l.remove(4);
		System.out.println(l);
	}

}
