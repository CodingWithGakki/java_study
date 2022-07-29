package oop;

import java.io.*;

public class Iotest {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("输入字符，按下 'q' 键推出。");
        //do {
        //    c = (char) br.read();
        //    System.out.println(c);
        //} while (c != 'q');

        //String str;
        //System.out.println("Enter lines of test.");
        //System.out.println("Enter 'end' to quit.");
        //do {
        //    str=br.readLine();
        //    System.out.println(str);
        //}while (!str.equals("end"));

        int b;
        b='A';
        System.out.write(b);
        System.out.write('\n');

        File file = new File("D:\\接口文档.txt");
        FileInputStream f = new FileInputStream(file);

        int read = f.read();

    }
}
