//실습4-12
package src.practice.chap04;

import java.util.Scanner;

class Seat{

	public String SAB;
	public String seat[]= {"---","---","---","---","---","---","---","---","---","---"};

	public Seat(String x) {
		SAB=x;
	}
	public void list() {
		System.out.print(SAB+">>");
		for(int i=0;i<seat.length;i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
	}
	public void findSeat(String name,int seatnum) {
		while(true){
			if(seat[seatnum-1].equals("---")) {
				seat[seatnum-1]=name;
				break;
			}
			else
				System.out.println(seatnum+"번 좌석에는 이미 예약이 되어있습니다. 좌석을 다시 선택하십시오.");
		}
	}
	public void cancel(String name) {
		int k=11;
		for(int i=0;i<seat.length;i++) {
			if(seat[i].equals(name)) {k=i; break;}
		}
		if(k!=11) {
			seat[k]="---";
		}
		if(k==11)
			System.out.println(name+"으로 예약된 자리가 없습니다.");
	}
}

public class ReservationSystem {
	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스텝입니다.");
		Seat s[] = new Seat[3];
		s[0] = new Seat("S");
		s[1] = new Seat("A");
		s[2] = new Seat("B");
		Scanner scanner = new Scanner(System.in);


		while(true){
			int num=0;
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			num = scanner.nextInt();

			if(num==1) {
				System.out.print("좌석 구분 S(1), A(2), B(3)>>");
				int number= scanner.nextInt();
				s[number-1].list();
				System.out.print("이름>>");
				String name = scanner.next();
				System.out.print("번호>>");
				int seatnum = scanner.nextInt();
				s[number-1].findSeat(name,seatnum);
			}
			else if(num==2){
				for(int i=0;i<3;i++) {s[i].list();}
				System.out.println("<<<<조회를 완료하였습니다.>>>>");
			}
			else if(num==3){
				System.out.print("좌석 S(1), A(2), B(3)>>");
				int number= scanner.nextInt();
				s[number-1].list();
				System.out.print("이름>>");
				String name = scanner.next();
				s[number-1].cancel(name);
			}
			else if(num==4) break;
			else System.out.println("숫자를 잘못 입력하였습니다. 다시 입력해 주세요.");
		}
		scanner.close();
	}
}
