package hw.ch03;

public class JeongGeeYoungDisplay implements AbstractDisplay {
    private String name; 
    private String studentId;
    private int grade; // 표시해야 하는 문자 

    // 생성자 
    public JeongGeeYoungDisplay(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade; 
    }

    @Override
    public void open() {
        // 시작 문자열 "="를 표시한다 
        System.out.print("====================\n");
        System.out.println("덕성여대 컴퓨터공학과");
    }

    @Override
    public void print() {
        // 필드에 저장해 둔 문자를 1회 표시한다
        System.out.print("학번 " + studentId + " / " + grade + "학년 / " + name + "\n");
    }

    @Override
    public void close() {
        System.out.println("템플릿 메소드 패턴 숙제입니다.");
        // 종료 문자열 "="를 표시한다 
        System.out.println("====================");
    }
}