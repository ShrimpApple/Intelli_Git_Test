package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReadLineExam {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("D:/pyw_data/java_data/thisisjava/src/ch18/sec07/exam02/ReadLineExam.java")
        );

        int lineNO = 1;
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            System.out.println(lineNO + "\t" + str);
            lineNO++;
        }

        br.close();
    }
}

