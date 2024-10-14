package ch02.sec12;

// 변수의 자리수 설정이해
// 2024. 10. 02

import java.util.Scanner;

public class Sec12test {
    public static void main(String[] args) {

        // 초기값
        String name ="박영웅";
        int age = 128;
        String posi = "기흥";
        int preAge = 8;
        double myRate = 23.4527;

        // println과 printf 차이 비교
        System.out.println("이름: " + name + ", 나이: " + age + "사는곳");
        System.out.printf("이름: %s, 나이:%d, 사는곳: %s\n", name, age, posi);

        // 수를 표시할때 자리수 지정
        System.out.println("현재나이: " + age);
        System.out.println("이전나이: " + preAge);

        System.out.printf("현재나이: %2d\n", + age);
        System.out.printf("이전나이: %2d\n", + preAge);

        // 자리올림 확인
        System.out.println("나의 실적율: " + myRate);
        System.out.printf("나의 실적율 %10.2f", myRate);



    }
}
