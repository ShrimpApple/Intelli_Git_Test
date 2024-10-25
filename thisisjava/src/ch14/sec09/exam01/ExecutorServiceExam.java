package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExam {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.shutdown();
    }
}
