//예제 7-8
package src.example.chao07;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
    static void printList(LinkedList <String> l){
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()){
            String e = iterator.next();
            String separtor;
            if(iterator.hasNext())
                separtor = "->";
            else
                separtor="\n";
            System.out.print(e+separtor);

        }
    }

    public static void main(String[] args) {
        LinkedList<String> mylist = new LinkedList<String>();
        mylist.add("트랜스포머");
        mylist.add("스타워즈");
        mylist.add("매트릭스");
        mylist.add(0,"터미네이터");
        mylist.add(2,"아바타");

        Collections.sort(mylist);//요소 정렬
        printList(mylist);//정렬된 요소 출력

        Collections.reverse(mylist);//요소의 순서를 반대로
        printList(mylist); //요소 출력

        int index = Collections.binarySearch(mylist,"아바타")+1;
        System.out.println("아바타는 "+index+"번째 요소입니다.");
    }
}
