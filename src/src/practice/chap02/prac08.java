/*
 * (2장 실습문제 08번)소스파일:prac08.java
 * 7번에서
'직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다.'라고 적혀있지만
(100,100)과 (200,200)을 이용하여 좌표평면에 직사각형을 만들 경우 왼쪽 상단 모서리와 오른쪽 하단 모서리 점이 될 수 없다.
>>(100,100)과 (200,200)으로 "왼쪽 하단" 모서리와 "오른쪽 상단" 모서리의 두 점이루어진 사각형으로 이해하였고, 사각형안에 사각형이 포함되면 충돌한다고 보지않고 코드진행을 하였다.
 */
package src.practice.chap02;

import java.util.Scanner;

public class prac08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y <=recty2))
			return true;
		else return false;
	}
	public static void main(String[] args) {
		System.out.println("왼쪽 하단 모서리와 오른쪽 상단 모서리의 두점을 입력하시오 (x1, y1),(x2, y2): ");
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		System.out.print("("+ x1 +", " + y1 + "),("+ x2+", " + y2 +")로 이루어진 사각형은");
		int count =0;
		boolean TorF;

		TorF = inRect(x1,y1, 100,100, 200,200);
		if(TorF == true)
			count = count + 1;
		TorF = inRect(x2,y1, 100,100, 200,200);
		if(TorF == true)
			count = count + 1;
		TorF = inRect(x1,y2, 100,100, 200,200);
		if(TorF == true)
			count = count + 1;
		TorF = inRect(x2,y2, 100,100, 200,200);
		if(TorF == true)
			count = count + 1;

		//(100,100)과 (200,200)직사각형안에 모서리가 포함될 경우 1~2개는 사각형끼리 충돌하지만 4개가 포함되면 일치(충돌)하거나 충돌하지않는다.
		if(count == 4) {
			if(x1>100 && y1>100 && x2<200 && y2<200)
				System.out.println("(100,100)과(200,200)으로 이루어진 사각형과 충돌하지않는다.");
			else
				System.out.println("(100,100)과(200,200)으로 이루어진 사각형과 일치(충돌)한다.");
		}
		if(count<4 && count>0)
			System.out.println("(100,100)과(200,200)으로 이루어진 사각형과 충돌한다.");

		//모서리가 사각형 안에 포함되지는 않지만 (x1,y1),(x2,y2)로 이루어진 사각형과 선이 만날경우 충돌한다.
		if(count == 0) {
			if((x1 < 100 && y1 < 100 && x2 > 200 && y2 > 200) || x1>200 || x2 < 100 || y1 > 200 || y2 < 100)
				System.out.println("(100,100)과(200,200)으로 이루어진 사각형과 충돌하지않는다.");
			else
				System.out.println("(100,100)과(200,200)으로 이루어진 사각형과 충돌한다.");

		}
	}
}