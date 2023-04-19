package hw.ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20190990, 이름: 정지영\n");

        List<Student> list = new ArrayList<>();

        list.add(new Student("최승훈", "20230420", 180));
        list.add(new Student("정지영", "20190990", 165));
        list.add(new Student("김철수", "20230301", 170));
        list.add(new Student("최유리", "20200630", 155));
        list.add(new Student("이정우", "20160218", 185));

        // 사전순으로 작은 순서 (오름차순)
        System.out.println("(1) 정렬 결과 (오름차순)");
        list.sort(new ComparatorAscending());
        System.out.println(list + "\n");

        // 사전순으로 큰 순서 (내림차순)
        System.out.println("(2) 정렬 결과 (내림차순)");
        list.sort(new ComparatorDesending());
        System.out.println(list);
    }
}
