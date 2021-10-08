//실습4-04
package src.practice.chap04;

public class Rectangle {
	int x, y, width, height;
	public Rectangle(int x1,int y1,int width1,int hieght1) {
		x=x1;
		y=y1;
		width=width1;
		height=hieght1;
	}
	public int square() {
		return width*height;
	}
	void show() {System.out.println("("+x+","+y+")에서 크기가"+width+"x"+height+"인 사각형");	}

	public boolean contains(Rectangle r) {
		if(x<r.x&&y<r.y&&x+width>r.x+r.width&&y+height>r.y+r.height)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);

		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r))System.out.println("t는 r을 포함합니다.");
		if(t.contains(s))System.out.println("t는 s를 포합합니다.");
	}

}
