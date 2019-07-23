
public class Lab405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new CurrentStudent();
		p.sleeping();
		if(p instanceof CurrentStudent){
			((CurrentStudent) p).walkinging();
		}

	}

}
abstract class Person{

	abstract void sleeping();
	abstract void walking();
}
 abstract class Student extends Person{
	 void sleeping(){
		 System.out.println("Stu ---------------sleeping()");
		 
	 }
	
}
 class CurrentStudent extends Student{
	 void walking(){
		 System.out.println("Stu ---------------slewalkinging()");
		 
	 }
 }