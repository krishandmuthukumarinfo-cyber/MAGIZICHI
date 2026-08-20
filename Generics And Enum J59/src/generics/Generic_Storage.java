package generics;

public class Generic_Storage<T> {
     private T value;

    public void store(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Stored Value: " + value);
    }
    
    
}
