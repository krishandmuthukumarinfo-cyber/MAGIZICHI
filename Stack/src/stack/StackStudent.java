package stack;

public class StackStudent {
    
    String student[] = new String[5];
    int top = -1;
    
    public static void main(String[] args) {
        
     StackStudent ss = new StackStudent();
     ss.push("ARUN");
     ss.push("BALA");
     ss.push("KUMAR");
     ss.push("RAVI");
     ss.push("SURESH");
     
     ss.pop();
     
     ss.peek();
     
     ss.display();
     
        
    }
    
    
    public void push(String data)
    {
        if (top == student.length -1) 
        {
            System.out.println("STACK IS FULL");
            return;
        }
        else
        {
            top++;
            student[top] = data;
            System.out.println("STACK IS BOOKED : "+student[top]);
        }
    
    }
    
    public void pop()
    {
    
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        } else {
            System.out.println("THANK YOU : " + student[top]);
            top--;
        }

    
    }
    
    
    public void peek()
    {
    
    if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        } else {
            System.out.println("PEEK STUDENT : " + student[top]);
        }

    }
    
    
    public void display()
    {
    for (int i =top; i >= 0; i--) {
            System.out.println("STUDENTS : " + student[i]);
        }
    }
    
}
