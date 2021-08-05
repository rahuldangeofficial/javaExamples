//the simple example of inheritance

class SimpleInheritance{
	public static void main(String args[]){
		A superOb=new A();
		B subOb=new B();

		//the superclass maybe used by itself
		superOb.i=10;
		superOb.j=20;
		System.out.println("Contents of superOb : ");
		superOb.showij();
		System.out.println();

		//the subclass has access to all public member of its superclass
		subOb.i=7;
	        subOb.j=8;
		subOb.k=9;
		System.out.println("contents of subOb :");
		subOb.showij();
		subOb.showk();
		System.out.println();
		
		System.out.println("sum of i,j,k of subOb :");
		subOb.sum();	
	
	}
}

//create a superclass
class A{
	int i,j;

	void showij(){
		System.out.println("i and j: "+i+" "+j);
	}
}

//create a superclass by extending class A
class B extends A{
	int k;

	void showk(){
		System.out.println("k: "+k);
	}

	void sum(){
		System.out.println("i+j+k: "+(i+j+k));
	}
}
