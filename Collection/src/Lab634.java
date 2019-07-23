import java.util.TreeSet;

public class Lab634 {
public static void main(String[] args) {
	TreeSet st=new TreeSet<>();
	st.add(new Employee(101,"KKR") );
	st.add(new Employee(100,"DD") );
	st.add(new Employee(105,"MI") );
	st.add(new Employee(109,"CSK") );
	st.add(new Employee(108,"RR") );
	System.out.println(st);
	
}
}
class Employee implements Comparable{
	int emp_id;
	String emp_name;
	
	public Employee(int emp_id,String emp_name) {
    this.emp_id=emp_id;
    this.emp_name=emp_name;
	}

	@Override
	public int compareTo(Object o) {
if(o instanceof Employee){
	Employee emp=(Employee) o;
	return this.emp_name.compareTo(emp.emp_name);
}
		return 0;
	}
	@Override
	public String toString() {
		return emp_id+"  "+emp_name;
	}
	
}
