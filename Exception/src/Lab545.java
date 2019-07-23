
public class Lab545 {
	public static void main(String[] args) {
		System.out.println("main started");
		
		
		try{
			
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
			
		}
		catch(NumberFormatException nu){
			System.out.println(nu);
			
		}
		catch(ArithmeticException a){
			System.out.println(a);
			
		}
		catch(Exception e){
			System.out.println("Enter the correct value!!");
		}
		System.out.println("main end!!");
	}

}
