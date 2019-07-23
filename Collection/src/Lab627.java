import java.util.HashSet;

public class Lab627 {
	public static void main(String[] args) {
		HashSet hs=new HashSet<>();
		hs.add(new Student10(99));
		hs.add(new Student10(99));
		hs.add(new Student10(99));
		hs.add(new Student10(99));
		hs.add(new Student10(99));
		System.out.println(hs);
	}
	

}
class Student10{
	int sid;
	Student10(int sid){
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
		if(obj instanceof Student10){
			Student10 st=(Student10) obj;
			return this.sid==st.sid;
		}
		return false;
		
		
	}
	
}