package hw.ch10;

public class Student implements Comparable<Student>{
    String name = "";
    String id = "";
    int height = 0;

    public Student(String name, String id, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    @Override
    public int compareTo(Student s) {
        // 현재 객체와 들어온 객체 키 비교
        return Integer.compare(this.height, s.height);
    }

    @Override
    public String toString() {
        return "(이름: " + name + ", 학번: " + id + ", 키: " + height + ")";
    }
}
