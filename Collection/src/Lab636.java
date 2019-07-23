import java.util.Comparator;
import java.util.TreeSet;

public class Lab636 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>(new SidComparetor());
		ts.add(new Student2(10, "KKR"));
		ts.add(new Student2(500, "CSK"));
		ts.add(new Student2(01, "MI"));
		ts.add(new Student2(80, "HSR"));
		ts.add(new Student2(77, "DD"));
		System.out.println(ts);
		
	}

}
class Student2{
	int sid;
	String name;
	public Student2(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	@Override
	public String toString() {

	return sid+"\t"+name;
			}
	
}
class SidComparetor implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		if(obj1 instanceof Student2 && obj2 instanceof Student2 ){
			Student2 st1=(Student2)obj1;
			Student2 st2=(Student2)obj2;
			return st2.sid-st1.sid;
		}
		return 0;
	}
	
}
