package Adapter;

import java.io.*;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 21:40
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:\\java\\DesignPattern\\src\\main\\java\\Adapter\\adapterTest.txt");
        InputStreamReader isr = new InputStreamReader(fileInputStream);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while(line!=null && !line.equals("")){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
