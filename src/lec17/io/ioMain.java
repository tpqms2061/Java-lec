package lec17.io;

import java.io.FileWriter;
import java.io.IOException;


public class ioMain {

    public static void writeFile(String filename, String content) {
        FileWriter writer = null;

        try {
            writer = new FileWriter(filename);
            writer.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e){
                e.printStackTrace();
            }

        }
        }


    public static void main(String[] args) {
        writeFile("launch menu.txt", "오늘의 메뉴누ㅡㄴ 머냐");
        System.out.println("파일생성 완료" );


    }
}
