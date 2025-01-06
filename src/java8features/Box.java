package java8features;

public class Box<T> {

    T container;

    public Box(T container){
        this.container=container;
    }

    public T getContainer() {
        return container;
    }
}
