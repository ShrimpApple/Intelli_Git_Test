package ch03.sec08;

public class BitLogicExam {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        System.out.println("------------------------------------");

        byte reciveData = -120;

        int unsignedInt1 = reciveData & 255;
        System.out.println(unsignedInt1);

        int unsignedInt2 = Byte.toUnsignedInt(reciveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
    }
}
