import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 (종료하려면 Q 입력): ");
            String input = scanner.next();

            // 종료 조건 확인
            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                // 짝수일 경우에만 출력
                if (number % 2 == 0) {
                    System.out.println("입력된 짝수: " + number);
                }
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력해주세요.");
            }
        }

        scanner.close(); // 리소스 해제를 위해 Scanner 닫기
        System.out.println("프로그램을 종료합니다.");
    }
}
