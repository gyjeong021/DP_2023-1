package hw.ch12;

public class MultiSideBorder extends Border {
    private char borderChar;  // 장식 문자
    private int num;

    // 내용물이 될 Display와 장식 문자를 지정
    public MultiSideBorder(Display display, char borderChar, int num) {
        super(display);
        this.borderChar = borderChar;
        this.num = num;
    }

    @Override
    public int getColumns() {
        // 문자 수는 내용물의 양쪽에 장식 문자만큼 더한 것
        return 1 + display.getColumns() + 1 + num*2;
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수와 같다
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 지정 행의 내용은 내용물의 지정 행 양쪽에 장식 문자를 붙인 것
        StringBuilder rowTextBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            rowTextBuilder.append(borderChar);
        }
        rowTextBuilder.append(display.getRowText(row));
        for (int i = 0; i < num; i++) {
            rowTextBuilder.append(borderChar);
        }
        return rowTextBuilder.toString();
    }
}
