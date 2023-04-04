package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_JeongGeeYoung extends Product{
    private String modelName;

    public Car_JeongGeeYoung(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void use() {
        System.out.println(this + "인 car를 사용합니다.");
    }

    @Override
    public String toString() { // Object 클래스(모든 클래스의 제일 부모 클래스)로부터 상속
        return "모델명 " + modelName;
    }

    public String getModelName() {
        return modelName;
    }
}
