//예제 6-9 : StringTokenizer 클래스 메소드 활용
package src.example.chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}