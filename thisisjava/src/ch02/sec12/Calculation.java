package ch02.sec12;

// 두개의 숫자를 입력받아 +, - *, / 를 실행하는 프로그램 작성
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요: ");
        int inputA = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요: ");
        int inputB = scanner.nextInt();

        System.out.println("첫번째 + 두번째 = " + (inputA+inputB));
        System.out.println("첫번째 + 두번째 = " + (inputA-inputB));
        System.out.println("첫번째 + 두번째 = " + (inputA*inputB));
        System.out.printf(" %d / %d = %5.2f", inputA, inputB, ((double)inputA/inputB));


    }
}
