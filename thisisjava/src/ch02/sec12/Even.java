package ch02.sec12;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int input = scanner.nextInt();

        if (input % 2 == 0){
            System.out.println("짝수입니다.");
        }
        else
        {
            System.out.println("홀수입니다.");
        }
    }
}
