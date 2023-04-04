package hw.ch04.framework;

import java.util.Vector;

public abstract class Factory {
    // 제품 생산 시의 큰 흐름을 결정 => 탬플릿 메소드
    public final Product create(String modelName) {
        Product p = createProduct(modelName);
        registerProduct(p);
        return p;
    }

    // 자식이 구체적인 생산 방법을 결정 => factory method
    protected abstract Product createProduct(String modelName); // 선언, body 부분이 없음
    
    protected abstract void registerProduct(Product product); 

    public abstract void printAllModelNames();
}
