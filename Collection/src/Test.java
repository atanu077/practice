import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		for(int i=0;i<=10;i++){
			al.add(i);
		}
		Iterator it=al.iterator();
		while(it.hasNext()){
			Integer i=(Integer) it.next();
			if(i%2==0)
				System.out.println(i);
			
			else
			it.remove();
					//System.out.println(i);
		}
		System.out.println(al);
	}

}
