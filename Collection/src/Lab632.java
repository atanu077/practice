import java.util.TreeSet;

public class Lab632 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
		ts.add(new Emp());
		ts.add(new Emp());
		ts.add(new Emp());
		System.out.println(ts);
		
	}

}
class Emp implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
