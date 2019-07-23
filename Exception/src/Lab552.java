
public class Lab552 {
	public static void main(String[] args) {
		System.out.println("main started....");
		String data=null;
		try{
		data=args[0];	
		}
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println(ai);
		}
		
		int x;
		try{
			x=Integer.parseInt(data);	
			}
			catch(NumberFormatException no){
				System.out.println(no);
			}
	}

}
