//실습5-02
package src.practice.chap05;

class ColorTv{

    int inches, colors;
    public ColorTv(){
        this.inches=inches;
        this.colors=colors;
    }
    public ColorTv( int inches, int colors){
        this.inches=inches;
        this.colors=colors;
    }
    public void showColorTv(){
        System.out.println(inches+"인치 "+colors+"컬러");
    }
}
public class IPTV extends ColorTv{
    private String adress;
    public IPTV(String adress,int inches, int colors){
        super(inches,colors);
        this.adress=adress;
    }
    public void printProperty(){
        System.out.print("나의 IPTV는 " + adress+"주소의 ");
        showColorTv();

    }


    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2",32,2048);//"192.1.1.2" 주소에 32인치, 2048컬러

        iptv.printProperty();
    }
}
