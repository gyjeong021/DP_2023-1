package hw.ch04.framework;

public abstract class Product {
    // 컴파일 오류, 생성자는 상속 안됨
    // public abstract Product(String name);

    public abstract void use();
}
