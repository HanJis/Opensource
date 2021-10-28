//실습7-12
package src.practice.chap07;

import java.util.*;

class Word {
    String Eng;
    String Kor;

    public Word(String Eng, String Kor) {
        this.Eng = Eng;
        this.Kor = Kor;
    }
}
public class OpenChallenge {
    public static void main(String[] args) {
        HashMap<Integer, Word> v = new HashMap<Integer, Word>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        {
            v.put(0, new Word("love", "사랑"));
            v.put(1, new Word("animal", "동물"));
            v.put(2, new Word("emotion", "감정"));
            v.put(3, new Word("human", "인간"));
            v.put(4, new Word("stock", "주식"));
            v.put(5, new Word("trade", "거래"));
            v.put(6, new Word("society", "사회"));
            v.put(7, new Word("baby", "아기"));
            v.put(8, new Word("honey", "꿀"));
            v.put(9, new Word("dall", "인형"));
            v.put(10, new Word("bear", "곰"));
            v.put(11, new Word("picture", "사진"));
            v.put(12, new Word("painting", "그림"));
            v.put(13, new Word("fault", "오류"));
            v.put(14, new Word("example", "보기"));
            v.put(15, new Word("eye", "눈"));
            v.put(16, new Word("statue", "조각상"));
        } //17개 영어
        System.out.print("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
        while (true) {
            System.out.print("\n단어 테스트:1, 단어 삽입:2, 종료:3>>");
            int menunum = scanner.nextInt();
            if (menunum == 1) {
                System.out.println("현재 " + v.size() + "개의 단어가 들어있습니다. -1를 입력하면 테스트를 종료합니다.");

                int vrandomnum[] = new int[v.size()];
                for (int i = 0; i < v.size(); i++) {
                    vrandomnum[i] = random.nextInt(v.size());
                    for (int j = 0; j < i; j++) {
                        if (vrandomnum[i] == vrandomnum[j]) i--;
                    }
                }

                int l = 0;
                while (true) {
                    Word word = v.get(vrandomnum[l]);
                    System.out.println(word.Eng + "?");
                    String example[] = new String[4];
                    int a[]= new int[4];

                    for (int i = 0; i < 4; i++) {
                        a[i]= random.nextInt(v.size());
                        for (int j = 0; j < i; j++) {
                            if (a[i] == a[j]) i--;
                        }
                    }
                    for(int i=0;i<4;i++){
                        Word exword = v.get(a[i]);
                        example[i]= exword.Kor;
                    }
                    int n=0;
                    for (int i = 0; i < 4; i++) {
                        if(example[i].equals(word.Kor)) n++;
                    }
                    if(n==0){
                        int k=random.nextInt(4);
                        example[k]=word.Kor;
                    }
                    for(int i=0;i<4;i++){
                    System.out.print("("+(i+1)+")"+example[i]+" ");
                    }
                    System.out.print(" :>");
                    String answer = scanner.next();

                    if(answer.equals("-1"))break;
                    else if(answer.equals("1")||answer.equals("2")||answer.equals("3")||answer.equals("4")){
                        if(example[Integer.parseInt(answer)-1].equals(word.Kor)) System.out.println("Excellent !!");
                        else System.out.println("No. !!");

                    }
                    else System.out.println("숫자를 입력하세요!");
                    l++;
                }


            } else if (menunum == 2) {
                int k = 0;
                System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                while (true) {
                    System.out.print("영어 한글 입력>>");
                    String English = scanner.next();
                    if (English.equals("그만")) break;
                    String Korea = scanner.next();

                    v.put(v.size(), new Word(English, Korea));
                }
            } else if (menunum == 3) {
                System.out.println("\"명품영어\"를 종료합니다.");break;}
            else
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
        }
    }

}
