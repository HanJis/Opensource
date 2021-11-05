//예제 8-2 : InputStreamReader로 한글 텍스트 파일 읽기
package src.example.chap08;

import java.io.*;

public class FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("c:\\\\Temp\\\\hangul.txt");
            in = new InputStreamReader(fin, "UTF-8"); //MS949 사용시 글자 깨짐이 있어 UTF-8로 변경 하였습니다.
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
            fin.close();

        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}