
public class Lab451 {
	public static void main(String[] args) {
		Student s1=new Student(99, "atanu");
		Student s2=new Student(101, "Hello");
		Student s3=new Student(99, "atanu");
		Student s4=new Student(990, "atanu");
	boolean b1=	s1.equals(s2);
	System.out.println(b1);
	boolean b2=	s2.equals(s3);
	System.out.println(b2);
		boolean b3=	s1.equals(s3);
		System.out.println(b3);
	//boolean b1=	s1.equals(s2);
		
	}

}
class Student{
	int sid;
	String name;
	 Student(int sid,String name) {
this.sid=sid;
this.name=name;
	 }
	 @Override
	public boolean equals(Object obj) {
		 Student st=(Student)obj;
		 return st.sid==this.sid && st.name.equals(this.name);
		  

	}
	 
	 
}