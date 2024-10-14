import java.util.Scanner;

public class MaxMin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (종료하려면 Q 입력): ");
            String inputA = scanner.next();

            // 종료 조건 확인
            if (inputA.equalsIgnoreCase("Q")) {
                break;
            }

            System.out.print("두 번째 숫자를 입력하세요 (종료하려면 Q 입력): ");
            String inputB = scanner.next();

            // 종료 조건 확인
            if (inputB.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                int a = Integer.parseInt(inputA);
                int b = Integer.parseInt(inputB);

                int max = (a > b) ? a : b;  // 최댓값 계산
                int min = (a < b) ? a : b;  // 최솟값 계산

                System.out.println("max = " + max);
                System.out.println("min = " + min);
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력해주세요.");
            }
        }

        scanner.close(); // 리소스 해제를 위해 Scanner 닫기
        System.out.println("프로그램을 종료합니다.");
    }
}
