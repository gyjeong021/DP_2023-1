package hw.ch11;

import java.util.ArrayList;
import java.util.List;

// composite(그릇)에 해당되는 클래스
public class Directory extends Entry {
    private String name;
    private String date;
    private String author;

    // 자기 내용물들을 관리하는 리스트
    private List<Entry> directory = new ArrayList<>(); // Entry는 부모 타입임

    public Directory(String name, String date, String author) {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    // 자기 내용물들의 size를 다 합치는 일을 함
    public int getSize() {
        int size = 0;

        // 확장된 for문
        for (Entry entry: directory) {
            size += entry.getSize(); // 재귀적 호출
        }
        return size;
    }

    @Override
    // 자기 내용물들의 printList를 호출함
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this); // 자기것 출력
        for (Entry entry: directory) { // 자식들 출력
            entry.printList(prefix + "/" + name);
        }
    }

    @Override
    public int getCount() {
        int cnt = 0;

        // 확장된 for문
        for (Entry entry: directory) {
            cnt += entry.getCount();
        }
        return cnt;
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
