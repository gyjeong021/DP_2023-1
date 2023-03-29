package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("20190990 정지영");

        FileIO f = new FileProperties(); //어댑터 생성
        try {
            f.readFromFile("file.txt");
            f.setValue("Year", "2023");
            f.setValue("bornYear", "2000");
            f.setValue("StudentId", "20190990");
            f.setValue("Name", "Jeonggeeyoung");
            f.setValue("Location", "Seoul");
            f.writeToFile("JeongGeeYoung.txt");
            System.out.println("JeongGeeYoung.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
