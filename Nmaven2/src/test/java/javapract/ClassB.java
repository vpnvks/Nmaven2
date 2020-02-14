package javapract;

public class ClassB extends ClassA {
	public ClassB(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	int A;int E;
	public void PrintB() {
		super.A=5;
		A=super.A;
		this.A=A+1;
		int B=this.A+super.A;
		System.out.println("value of B is="+B);
		
	}
	public void printA() {
		System.out.println("this is prented from B class so value is"+this.A+1);
		//super.printA();
	}
	
	public void printC(int E) {
		this.E=E;
		//this.E=12;
		System.out.println(this.E);
	}
	

}
