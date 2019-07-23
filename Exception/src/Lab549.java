
public class Lab549 {
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			int res=10/0;
			System.out.println("res is");
			System.out.println(res);
			
		}
	
		catch(NumberFormatException no){
			System.out.println("invalid input");
		}
		catch(Exception e){
			System.out.println("invalid input");
		}
		System.out.println("main completed");
	}

}
