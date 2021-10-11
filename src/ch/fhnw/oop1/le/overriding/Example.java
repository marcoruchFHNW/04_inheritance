package ch.fhnw.oop1.le.overriding;

public class Example {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.m();
    }
}

class Super {
    public int i = 1;
    
    void m() {
        System.out.println("Super.m() " + i);
    }
}

class Between extends Super {
    @Override
    void m() {
        System.out.println("Between.m() " + i);
    }
}

class Sub extends Between {
    public int i = 2;
    
    @Override
    void m() {
        System.out.println("Sub.m() " + i);
        super.m();
        System.out.println(i);
    }
}