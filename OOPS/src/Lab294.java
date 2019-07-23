import org.omg.Messaging.SyncScopeHelper;

public class Lab294 {
	public static void main(String[] args) {
		byte b=12;
		Hello h=new Hello();
		//h.show((byte) 12);
		h.show('A');
		h.show((char) 66);
		
	}

}
class Hello{

void show(char x){
	System.out.println("show byte!!"+x);
	}
}
