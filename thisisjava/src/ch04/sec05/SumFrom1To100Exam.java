package ch04.sec05;

public class SumFrom1To100Exam {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;
        while (i<100){
            sum +=i;
            i++;

        }
        System.out.print("1~" + (i-1) + "합 : " + sum);
    }
}
