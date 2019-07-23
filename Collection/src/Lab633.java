import java.util.TreeSet;

public class Lab633 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(new Student1(88, "Atanu"));
		ts.add(new Student1(188, "Deb"));
		ts.add(new Student1(8, "KKR"));
		ts.add(new Student1(10, "Avi"));
		System.out.println(ts);
	}

}
class Student1 implements Comparable {
	int sid;
	String name;
	
	public Student1(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	
	@Override
	public int compareTo(Object obj) {
if(obj instanceof Student1){
	Student1 st=(Student1)obj;
	return this.sid-st.sid;
}
		return 0;
	}
	@Override
	public String toString() {
return sid+"  "+name;
	}
	
}
