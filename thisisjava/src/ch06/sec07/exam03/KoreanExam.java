package ch06.sec07.exam03;

public class KoreanExam {

    public static void main(String[] args) {

        Korean kor1 = new Korean("kim");

        Korean kor2 = new Korean("park", "blue");

        System.out.println("1차이름 " + kor1.name);
        System.out.println();

        System.out.println("2차이름 " + kor2.name);
        System.out.println("2색상 " + kor2.ssn);

    }
}
