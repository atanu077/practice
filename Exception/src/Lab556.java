
public class Lab556 {
	public static void main(String[] args) {
		System.out.println("main started");
		
		try{
			int res=10/0;
			System.out.println(res);
		return;
		}
		catch(Exception e){
			System.out.println(e);
			//System.exit(0);
		}
		finally{
		System.out.println("main ensd!!");
		return;
		}
	}

}
