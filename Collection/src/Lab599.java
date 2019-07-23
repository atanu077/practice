import java.util.ArrayList;
import java.util.Collection;

public class Lab599 {
	public static void main(String[] args) {
		Collection col=new ArrayList<>();
		col.add("Atanu");
		col.add("Esha");
		col.add("Vijay");
		col.add("Rahul");
		System.out.println(col);
		
		Object arr[]=col.toArray();
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			arr[i]="RAJA";
			//System.out.println("new collection is:"+arr[i]);
		}
		//System.out.println("new collection is:"+arr[i]);
	}

}
