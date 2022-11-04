package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        // ArrayList에는 객체만 저장가능하다. 기본형을 넣으면 오토박싱됨
        list1.add(5);
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(2);

        // subList는 읽기전용 객체를 반환함.
        // 따라서 생성자를 이용해 인수로 객체를 넣어서 새로운 ArrayList를 만들어서 변경이 가능한 객체로 만듦.
        ArrayList list2 = new ArrayList(list1.subList(1,4));

        // Collection은 인터페이스, Collections는 유틸 클래스
        System.out.println("list1 = " + list1);
        Collections.sort(list1);
        System.out.println("list1 = " + list1);
        Collections.sort(list2);
        System.out.println("list2 = " + list2);

        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2));

        // 특정 index에 객체를 넣고 그 뒤에 나머지 객체를 밀게 됨.
        list2.add("B");
        list2.add("C");
        list2.add(2, "A");
        System.out.println("list2 = " + list2);

        list1.add(0, "1");
        System.out.println("list1.indexOf(\"1\") = " + list1.indexOf("1"));
        System.out.println("list1.indexOf(new Integer(1)) = " + list1.indexOf(new Integer(1)));

        list2.remove(1); // 인덱스 1 에 있는 객체를 삭제
        list2.remove(new Integer(1)); // Integer 1을 삭제


    }
}
