package hw.ch11;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<>20190990 정지영>");

        Directory mydocuments = new Directory("MyDocuments","20230425", "geeyoungjeong");

        Directory mydata = new Directory("MyData","20230425", "geeyoungjeong");
        Directory mypictures = new Directory("MyPictures","20230425", "geeyoungjeong");
    
        // 컴파일러 입장에선 변수의 타입이 실제 들어간 객체보다 중요함
        
        mydocuments.add(new File("정지영0.doc", "20230425", 1000,"geeyoungjeong"));
        
        mydocuments.add(mydata);
        
        mydata.add(new File("정지영1.doc","20230425", 2000, "geeyoungjeong"));
        mydata.add(new File("정지영2.java", "20230425", 3000, "geeyoungjeong"));

        mydata.add(mypictures);
        
        mypictures.add(new File("정지영3.gif", "20230425", 4000, "geeyoungjeong"));
        mypictures.add(new File("정지영4.jpg", "20230425", 5000, "geeyoungjeong"));
        mypictures.add(new File("정지영5.png", "20230425", 6000, "geeyoungjeong"));
        
        mydocuments.printList();
    }
}
