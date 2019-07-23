
public class Test100 {
	//private static char[] str;
	
	public static void main(String[] args) {
		char[] str={'k','f','a','p','a'};
		Atanu a=new Atanu();
		//a.FirstRepeatedChar(new str[]{aa,dsd});
		a.FirstRepeatedChar(str);
		
	}

}
class Atanu{
	public char FirstRepeatedChar(char[] str){
		int count[]=new int[256];
		for(int i=0;i<256;i++){
			count[i]=0;
			//System.out.println(count[i]);
		}
		for(int i=0;i<str.length;++i){
			System.out.println("begining count[i]"+count[i]);
			System.out.println("begining  str[i]"+str[i]);
			System.out.println("begining  count[str[i]]"+count[str[i]]);
			if(count[str[i]]==1){
				System.out.println(str[i]);
				break;
			}
			else{
				count[str[i]]++;
				
				System.out.println("count[str[i]]"+count[str[i]]);
				System.out.println("end count[i]"+count[i]);
				
			}
			if(i==str.length)
				System.out.println("Not Repeated char");
				}
		return 0;
	}
}
