
public class Lab570 {
	public static void main(String[] args) {
		System.out.println("main() started!!");
		try{
			StudentService serv=new StudentService();
			serv.getNameBySid(null);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
class StudentService{
	String getNameBySid(String id) throws StudentNotFoundException{
		if(id==null||id.isEmpty()||id.equals("AP-01"))
			throw new StudentNotFoundException(id);
		else
			return "Raja";
	}
}
class StudentNotFoundException extends Exception{
	public StudentNotFoundException(String sid) {
super(sid);
}
	
}
