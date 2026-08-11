package queue;

public class Queue {
    
    
    String que[] = new String[5]; 
    int front = -1;
    int back = -1;
    
    public static void main(String[] args) {
        Queue qe = new Queue();
        qe.enqueue("ARUN");
        qe.enqueue("BALA");
        qe.enqueue("KUMAR");
        qe.enqueue("RAVI");
        qe.enqueue("SURESH");
        
        qe.dequeue();
        qe.dequeue();  
        qe.dequeue();
        qe.dequeue();
        qe.dequeue();
        
        qe.peek();
        
    }
    
    
    public void enqueue(String name) {

        if (front == -1) {
            System.out.println("Queue is Empty");
        }
        if (front == -1) {
            front++;
        }
        back++;
        que[back] = name;
        System.out.println("Welcome to the Class : " + que[back]);

    }

    public void dequeue() {
        if (back == -1 || front > back) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("THANK YOU : " + que[front]);
        front++;
    }

    public void peek() {
        if (back == -1 || front > back) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(" Current Student : " + que[front]);

    }

    public void display() {
        for (int i = front; i <= back; i++) {
            System.out.println("Students : " + que[front]);
        }
    }

    
}
