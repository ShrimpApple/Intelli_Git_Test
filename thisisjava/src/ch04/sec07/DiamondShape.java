package ch04.sec07;

import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("홀수를 입력하세요: ");
        int n = scanner.nextInt();

        // 입력 값이 홀수인지 확인
        if (n % 2 == 0) {
            System.out.println("홀수를 입력해야 합니다.");
            return;
        }

        int mid = n / 2;

        // 마름모 출력
        for (int i = 0; i < n; i++) {
            int stars = i <= mid ? 2 * i + 1 : 2 * (n - i - 1) + 1;
            int spaces = (n - stars) / 2;

            // 공백 출력
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}

