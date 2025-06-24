package lec17.io;

import java.io.*;

public class Main {
    public static void writeFile(String filename,String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader((new FileReader(filename)))) {
            String line; //줄단위로 읽어들어옴  //없으면 null이 찍힘

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeFile("lunch-menu.txt","\n 냉면"); // 생성될때마다 프로그램에 입력됨
        System.out.println("파일 생성 완료");
    }
}