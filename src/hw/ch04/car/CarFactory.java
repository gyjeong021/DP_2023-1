package hw.ch04.car;

import java.util.Iterator;
import java.util.Vector;

import hw.ch04.framework.Product;

public class CarFactory extends hw.ch04.framework.Factory{
    Vector<Product> modelNames = new Vector<Product>();
    int index;
    Iterator<Product> iterator = modelNames.iterator();

    @Override
    protected Product createProduct(String modelName) {
        return new Car_JeongGeeYoung(modelName);
    }

    @Override
    protected void registerProduct(Product product) {
        modelNames.add(product);
    }

    @Override
    public void printAllModelNames() {
        System.out.println("<모델명 리스트>");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
