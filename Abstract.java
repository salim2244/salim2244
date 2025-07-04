abstract class AbstractDemo{
	public abstract int add(int a,int b);
	public void show(){
		System.out.println("Show method");
	}
	AbstractDemo(){System.out.println("AbstractDemo");}
}
class NonAbstractDemo extends AbstractDemo{
	public int add(int a,int b){
	return a+b;
	}
	NonAbstractDemo(){System.out.println("NonAbstractDemo");}
}
class AbstractTest{
	public static void main(String[] args){
		AbstractDemo nad=new NonAbstractDemo();
		nad.show();
		System.out.println(nad.add(4,5));
	}