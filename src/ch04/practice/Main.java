package ch04.practice;

import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;
import ch04.practice.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // 1. 신분증 생산 (직접)
        Product id01 = new IDCard("jgy");
        id01.use();

        // Product id = new IDCard(); // 인자 없는 생성자 만들지않음

        // 2. 신분증 생산 (공장을 통해서)
        Factory f = new IDCardFactory();
        Product id02 = f.create("jgy2");
        id02.use();
    }
}
