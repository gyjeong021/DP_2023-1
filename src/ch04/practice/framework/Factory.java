package ch04.practice.framework;

public abstract class Factory {
    // 제품 생산 시의 큰 흐름을 결정 => 탬플릿 메소드
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 자식이 구체적인 생산 방법을 결정 => factory method
    protected abstract Product createProduct(String owner); // 선언, body 부분이 없음
    /*protected abstract Product createProduct(String owner); {
        // 디폴트 구현
        return null;
    }*/
    protected abstract void registerProduct(Product product); 
}
