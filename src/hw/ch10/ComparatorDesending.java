package hw.ch10;

import java.util.Comparator;

public class ComparatorDesending implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s2.compareTo(s1);
        // b가 더 클 때 양수가 반환됨 => 뒤에 있는 것이 더 클 때 위치를 서로 바꿈
        // => 뒤에 있는 게 앞으로 옴 => 내림차순
    
    }
    
}
