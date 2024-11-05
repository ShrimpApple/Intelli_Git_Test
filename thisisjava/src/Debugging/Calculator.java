package Debugging;

public class Calculator {

    // 더하기 함수
    public int add(int a, int b) {
        int c = 0;
        c = a + b;
        return c;
    }

    // 빼기 함수
    public int sub(int a, int b) {
        return a - b;
    }

    // 곱하기 함수
    public int mul(int a, int b) {
        return a * b;
    }

    // 나누기 함수
    public double div(int a, int b) {
        // 0으로 나누는 경우 처리
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;  // 정수를 실수로 나누기 위해 형변환
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 사용 예시
        System.out.println("Add: " + calc.add(10, 5));    // 15
        System.out.println("Sub: " + calc.sub(10, 5));    // 5
        System.out.println("Mul: " + calc.mul(10, 5));    // 50
        System.out.println("Div: " + calc.div(10, 5));    // 2.0
        System.out.println("Div by 0: " + calc.div(10, 0)); // Error 메시지 출력, 0 반환
    }
}
