//실습4-10
package src.practice.chap04;

import java.util.Scanner;

class Dictionarry {
	private static String[] kor = {"사랑","아기","돈","미래","희망"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		int k=kor.length+2;
		for(int i=0;i<kor.length;i++) {
			if(word.equals(kor[i])) {
				k=i;
			}
		}
		if(k<=kor.length)
			return eng[k];
		else
			return "저의 사전에 없습니다.";
	}
}

public class DicApp{
	public static void main(String[] args) {
		System.out.println("한영 단어 검색프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("한글 단어?");
			String Search = scanner.next();
			if(Search.equals("그만")) {break;}
			System.out.println(Search+"은 " + Dictionarry.kor2Eng(Search));
		}while(true);
		scanner.close();
	}
}