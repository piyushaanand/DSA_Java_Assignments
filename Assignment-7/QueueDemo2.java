import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class QueueDemo2 {
    static Scanner sc = new Scanner(System.in);

    public static Node InsertQueue(Node rear, Node front) {
        Node q = new Node();
        System.out.println("Enter the Info Part: ");
        q.info = sc.nextInt();
        q.next = null;
        if (rear==null||front == null) {
            front = q;
            rear = q;
        } else {
            rear.next = q;
            rear = q;
        }
        return front;
    }

    public static Node DeleteQueue(Node rear, Node front) {
        if (front == null) {
            System.out.println("No Any Node can be Deleted !!!!");
        } else {
            System.out.println("The Deleted Node is " + front.info);
            front = front.next;
        }
        if (front == null) {
            rear = null;
        }
        return front;
    }

    public static void Display(Node rear, Node front) {
        Node s = front;
        if (s == null) {
            System.out.println("Queue is Empty !!!");
        }
        while (s != null) {
            System.out.print(s.info + "-->");
            s = s.next;
        }
        System.out.println();
    }

    public static Node getRear(Node front){
        if(front == null){
            return null;
        }else{
            Node s = front;
            while(s.next!=null){
                 s=s.next;
            }
            return s;
        }
    }

    public static void main(String[] args) {
        Node rear = null;
        Node front = null;

        while (true) {
            System.out.println("*****MENU*****");
            System.out.println("0.Exit");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("Enter your Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Inserting into the queue: ");
                    front = InsertQueue(rear, front);
                     rear = getRear(front);
                    break;

                case 2:
                    System.out.println("Deletion from the Queue");
                    front = DeleteQueue(rear, front);
                    break;

                case 3:
                    System.out.println("Display: ");
                    Display(rear, front);
                    break;

                default:
                    System.out.println("Wrong Choice !!!!");
                    break;
            }
        }
    }
}
