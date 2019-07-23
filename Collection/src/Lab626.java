import java.util.HashSet;

public class Lab626 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		System.out.println(set);
		
	}

}
class Student{
	int sid;
	
	public Student(int sid) {
		this.sid=sid;
	}
	@Override
	public String toString() {

		return ""+sid;
	}
	@Override
	public int hashCode() {
return sid;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student st=(Student)obj;
			return this.sid==st.sid;
		}
		return false;
	}
	}
