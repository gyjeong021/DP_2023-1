package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<20190990 정지영>>");
        MultiStringDisplay md = new MultiStringDisplay();

        md.add("학번: 20190990");
        md.add("이름: 정지영");
        md.add("핸드폰 번호: 010-1234-5678");

        Display d1 = new SideBorder(md, '%');

        Display d2 = new FullBorder(d1);

        Display d3 = new UpDownBorder(d2, '=');

        Display d4 = new MultiSideBorder(d3, '*', 3);
        d4.show();

    }
}
