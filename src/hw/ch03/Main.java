package hw.ch03;

public class Main {
    public static void main(String[] args) { 
        System.out.println("20190990 정지영");
        AbstractDisplay d1 = new JeongGeeYoungDisplay("정지영","20190990",3);

        d1.display(10);
        d1.display(5);
    }
}
