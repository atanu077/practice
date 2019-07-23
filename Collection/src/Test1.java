import java.util.Comparator;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		TreeSet st=new TreeSet<>(new enameComparator());
		st.add(new Emp1(501,"Atanu"));
		st.add(new Emp1(506,"Dip"));
		st.add(new Emp1(509,"Rahul"));
		st.add(new Emp1(500,"Esha"));
		st.add(new Emp1(504,"Mani"));
		System.out.println(st);
		
	}

}
class Emp1{
	int eid;
	String ename;
	Emp1(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	@Override
	public String toString() {
		return eid+"   "+ename;
	}
	
}
class enameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
if(o1 instanceof Emp1 && o2 instanceof Emp1){
	Emp1 e1=(Emp1) o1;
	Emp1 e2=(Emp1) o2;
	return e1.ename.compareTo(e2.ename);
}
		return 0;
	}
	
}
