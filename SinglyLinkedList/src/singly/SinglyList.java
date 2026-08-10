package singly;

public class SinglyList {

    public static Node head;
    
   public void insertAtBegin(String data)
    {
        
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
    }

   public void insertAtBegi(String data)
    {
        
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
    }

   
    public void insertAtBeg(String data)
    {
        
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
    }
    
    
    
    public void insertAtMiddle(String vijay, int data)
     {
    Node newNode = new Node(data);

    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
    }

    newNode.next = slow.next;
    slow.next = newNode;
    }

public void insertAtEnd(String data)
     {
     
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node temp = head;
        
        while (temp.next != null) {
            
            temp = temp.next;
            
        }
        
        temp.next = newNode;
     }



    public void display() {
        if(head == null){
            return;
        }
        
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        
        SinglyList si = new SinglyList();
       
        si.insertAtBegin(30);
        si.insertAtBeg(20);
        si.insertAtBegi(10);
        si.insertAtMiddle("VIJAY", 25);
        
        si.insertAtEnd(40);
        
        si.display();
    }



    
}
