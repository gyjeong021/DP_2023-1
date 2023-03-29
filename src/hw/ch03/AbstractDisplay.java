package hw.ch03;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    public default void display(int times) {
        open();
        for (int i = 0; i < times; i++) { 
            print();
        }
        close();
    }
}
