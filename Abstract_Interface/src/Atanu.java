
public abstract class Atanu {
	public abstract void m1();
	public void m2(){
		System.out.println("m2() in luck!!");
	}

}
abstract class Target extends Atanu{


	public abstract void m1();	
}
class Target1 extends Target{

	@Override
	public void m1() {
System.out.println("m1()  in Target!!");	
	}
	
}

