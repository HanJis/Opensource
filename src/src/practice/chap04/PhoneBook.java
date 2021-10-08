//실습4-08
package src.practice.chap04;

import java.util.Scanner;

class Phone{
	String name;
	String tel;
	public Phone(String name1,String tel1){
		name = name1;
		tel = tel1;
	}
}

public class PhoneBook {


	public static void main(String[] args) {
		System.out.print("인원수>>");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Phone [] p = new Phone[number];
		int k=number+2;
		for(int i=0;i<number;i++) {
			System.out.print("이름과 전화번호(이름과번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i]= new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
		do {
			System.out.print("검색할 이름>> ");
			String Search = scanner.next();
			for(int i=0;i<number;i++) {
				if(Search.equals("그만")) {k=number+3;}
				if(Search.equals(p[i].name)) {k=i;}
			}
			if(k==number+3)
				break;
			if(k==number+2)
				System.out.println(Search+" 이 없습니다.");
			else
				System.out.println(Search+"의 번호는 "+p[k].tel+" 입니다.");
			k=number+2;
		}while(true);
		scanner.close();
	}
}
