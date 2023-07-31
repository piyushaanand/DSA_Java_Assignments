import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class QueueDemo3 {
    static Scanner sc = new Scanner(System.in);

    public static Node insert(Node rear, Node front) {
        Node q = new Node();
        System.out.println("Enter the Info Part: ");
        q.info = sc.nextInt();
        q.next = null;
        if (front == null) {
            front = q;
            rear = q;
        } else {
            rear.next = q;
            rear = q;
        }
        return front;
    }

    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("No Node to delete!");
        } else {
            System.out.println("The deleted Node is " + front.info);
            front = front.next;
        }
        if (front == null) {
            rear = null;
        }
        return front;
    }

    public static void display(Node rear, Node front) {
        Node s = front;
        if (s == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue elements: ");
            while (s != null) {
                System.out.print(s.info + " ");
                s = s.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node rear = null;
        Node front = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    front = insert(rear, front);
                    break;
                case 2:
                    front = delete(rear, front);
                    break;
                case 3:
                    display(rear, front);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
