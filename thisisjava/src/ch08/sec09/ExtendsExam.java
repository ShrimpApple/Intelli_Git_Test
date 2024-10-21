package ch08.sec09;

public class ExtendsExam {
    public static void main(String[] args) {
        InterFaceCImpl impl = new InterFaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
       // ia.methodB();
        System.out.println();

        InterfaceB ib = impl;
        ia.methodA();
        // ia.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
