
public class Mark {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Stu s1=new Stu(99);
		System.out.println(s1);
		Stu s2=s1.myClone();
		System.out.println(s2.sid);
		System.out.println(s1==s2);
		

	}

}
interface STUClonable{
	
}
class Stu implements STUClonable {
	int sid;
	public Stu(int sid) {
       this.sid=sid;
}
	
	public Stu myClone() throws CloneNotSupportedException{
		if(this instanceof STUClonable){
			System.out.println("this:"+this);
			return new Stu(sid);
		}
		else throw new CloneNotSupportedException("");
	}
	
}