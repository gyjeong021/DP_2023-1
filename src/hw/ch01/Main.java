package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("20190990 정지영");

        BookShelf bookShelf = new BookShelf(6);
        bookShelf.appendBook(new Book("자료구조론", "박우창"));
        bookShelf.appendBook(new Book("소프트웨어분석설계", "최승훈"));
        bookShelf.appendBook(new Book("프로그래머수학", "이주영"));
        bookShelf.appendBook(new Book("컴퓨터동작원리", "유견아"));
        bookShelf.appendBook(new Book("컴퓨터그래픽스", "이경미"));
        bookShelf.appendBook(new Book("사피엔스", "정지영"));

        // 명시적으로 Iterator를 사용하는 방법 
        //Iterator<Book> it = bookShelf.iterator();
        Iterator<Book> it = bookShelf.iteratorBackward();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName() +" "+ book.getAuthor());
        }
        System.out.println();
    }
}
