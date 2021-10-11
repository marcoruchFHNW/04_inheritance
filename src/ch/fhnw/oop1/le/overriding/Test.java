package ch.fhnw.oop1.le.overriding;

public class Test {
	public static void main(String[] a){
	   C c = new C(); 
	   c.check();
	}
}

class A {
	public int x = 1;
	
	public void print() {
		System.out.println("A:" + x);
	}
}

class B extends A {
	public int x = 2;

	@Override
	public void print() {
		System.out.println("B:" + x);
		super.print();
	}
}

class C extends B {
	public int x = 3;

	@Override
	public void print() {
		super.print();
		System.out.println("C:" + x);
	}

	public void check() {
		print();
		super.print();
		System.out.println(x);
		System.out.println(super.x);
	}
}



