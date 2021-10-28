//실습7-8
package src.practice.chap07;

import java.util.*;
class Score{
    String name;
    int score;
    public  Score(String name, int score){
        this.name= name;
        this.score=score;
    }

    public int getScore() {
        return score;
    }
}
public class pointprogram {
    public static void main(String[] args) {
        HashMap<String, Score> point = new HashMap<String, Score>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("** 포인트 관리 프로그램입니다. **");
        while (true){
            System.out.print("이름과 포인트 입력 >> ");
            String input = scanner.nextLine();
            if(input.equals("그만"))break;
            StringTokenizer st = new StringTokenizer(input, " ");
            String name = st.nextToken().trim();
            int score = Integer.parseInt(st.nextToken().trim());


            Score searchname = point.get(name);
            if(searchname == null)
                point.put(name, new Score(name, score));
            else {
                searchname.score+=score;
            }
            Set<String> keys = point.keySet();
            Iterator<String> it = keys.iterator();
            while (it.hasNext()) {
                String nam = it.next();
                Score sco = point.get(nam);
                System.out.print("("+nam + "," + sco.getScore()+")");
            }
            System.out.println();
        }
     scanner.close();
    }
}
