package ch02.sec12;

public class OperP81 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        //int c = ++a + b++;
        ++a;
        b++;

        int c = a + b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

        for (int i = 0; i < 10; ++i) ;

    }
}
