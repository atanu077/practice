import java.util.ArrayList;
import java.util.List;

public class Lab607 {
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(100);
		l.add(500);
		l.add(1000);
		System.out.println(l);
		l.set(1, "Ram");
		System.out.println(l);
		System.out.println(l.get(2));
	}

}
