import java.util.Scanner;

public class MaxMin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();

        int max = 0, min = 0;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        scanner.close(); // 리소스 해제를 위해 Scanner 닫기
    }
}
