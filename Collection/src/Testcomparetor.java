import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Testcomparetor {
	public static void main(String[] args) {
		Bus bs1=new Bus(228, "MH");
		Bus bs2=new Bus(17, "KB");
		Bus bs3=new Bus(5, "SD");
		TreeSet ts=new TreeSet(new BusComparetor());
		ts.add(new Bus(23,"KK"));
		ts.add(new Bus(17, "KB"));
		ts.add(new Bus(5, "SD"));
		/*Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		System.out.println(ts);
		
		
	}

}
class Bus {
	int bus_no;
	String bus_name;
	 Bus(int bus_no, String bus_name) {
		this.bus_no = bus_no;
		this.bus_name = bus_name;
		}
	@Override
	public String toString() {
		return "Bus [bus_no=" + bus_no + ", bus_name=" + bus_name + "]";
	}
	
	
}
class BusComparetor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	if(o1 instanceof Bus && o2 instanceof Bus){
		Bus s1=(Bus) o1;
		Bus s2=(Bus) o2;
		//return s1.bus_no-s2.bus_no;
		return s1.bus_name.compareTo(s2.bus_name);
		
	}
		return 0;
	}
	
}
