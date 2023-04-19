package hw.ch10;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // 정렬 주체(List)는 음수가 리턴되면 그대로 두고, 양수가 리턴되면 위치를 서로 바꾼다.

        return s1.compareTo(s2); // String 클래스의 compareTo()를 이용해서 크기 비교를 함
        // (a-b)를 실행
        // a가 작을 떄는 음수가 리턴됨
        // a가 더 클 때는 위치를 서로 바꾼다 => 큰 걸 뒤로 보낸다 => 오름차순
    
    }
    
}
