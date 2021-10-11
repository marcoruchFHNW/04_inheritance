package ch.fhnw.oop1.le.initialization;

public class Example {
    public static void main(String[] args) {
        new C();
    }
}

class A {
    int i;


    A(int i) {
        this.i = i;
        System.out.println("A.A(int i)");
    }
}

class B extends A {
    B() {
        super(3);
        System.out.println("B.B()");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("C.C()");
    }
}
