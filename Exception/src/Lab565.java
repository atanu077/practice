
public class Lab565 {
	public static void main(String[] args) {
		System.out.println("main started");
		
		try{
			int res=10/0;
		}
		catch(NumberFormatException e){
			System.out.println(e);
			
		}
	}

}
