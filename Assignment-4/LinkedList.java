import java.util.Scanner;
class Node{
    protected int regd_no;
    protected int marks ;
    protected Node next;
}

class LinkedList{

    static Scanner sc = new Scanner(System.in);
     static Node start = null;

     public static void create(Node p){
        p = new Node();
        System.out.println("Enter Registration Number : ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter Marks : ");
        p.marks = sc.nextInt();
        p.next = null;
        start = p;
        System.out.println("Want to create more Nodes ?? (y/n)");
        char ch = sc.next().charAt(0);
        while(ch!='n'){
            Node q = new Node();
            System.out.println("Enter the Registration Number : ");
            q.regd_no = sc.nextInt();
            System.out.println("Enter the Marks : ");
            q.marks = sc.nextInt();
            q.next= null;
            p.next = q ;
            p=q;
            System.out.println("Want to create More Nodes ??(y/n)");
            ch = sc.next().charAt(0);
        }

     }
         public static void Display(Node temp){
               // temp = new Node();
                while(temp!=null){
                    System.out.println(temp.regd_no+"-"+temp.marks);
                    temp = temp.next;
                }
         }
          public static int Count(Node temp){
            int c =0;
            // temp = new Node();
            while(temp!=null){
                c++;
                temp = temp.next;
            }
            return c ;
          }

          public static void Search(Node temp){
            int f=0;
            System.out.println("Enter the Reg_no. whose Marks is to Update : ");
            int r = sc.nextInt();
            while(temp!=null){
                if(temp.regd_no==r){
                   System.out.println("Enter the Marks to be Increased : ");
                   int m = sc.nextInt();
                   temp.marks= temp.marks+m;
                   f=1;
                }
                temp=temp.next;
            }
          }

          public static Node ins_Beg(Node q){
            q = new Node();
            System.out.println("Enter the Details of q : ");
             q.regd_no = sc.nextInt();
             q.marks = sc.nextInt();
             q.next = start;
             start = q;
             return q;
          }

          public static Node ins_end(Node q){
           // temp = new Node();
              q= new Node();
              System.out.println("Enter the regd_no : ");    
              q.regd_no = sc.nextInt();
              System.out.println("enter the marks : ");
              q.marks = sc.nextInt();
              q.next = null;
              if(start == null){
                start = q;
               // return q;
                
              }else{
                Node temp = start;
                while(temp.next!=null){
                    temp = temp.next;
                }
                    temp.next = q ;
                
               
              }
               return q ;
          }

      public static Node ins_Any(Node q) {
    System.out.println("Enter the Location to Insert the Node: ");
    int loc = sc.nextInt();
    int c = Count(start);
    if (loc <= c + 1) {
        if (loc == 1) {
            q = ins_Beg(q);
        } else if (loc == c + 1) {
            q = ins_end(q);
        } else {
            Node temp = start;
            int cnt = 1;
            while (cnt < loc - 1) {
                cnt++;
                temp = temp.next;
            }
            Node newNode = new Node();
            System.out.println("Enter the reg_no of q: ");
            newNode.regd_no = sc.nextInt();
            System.out.println("Enter the Marks of q: ");
            newNode.marks = sc.nextInt();

            newNode.next = temp.next;
            temp.next = newNode;

            q = newNode;
        }
    } else {
        System.out.println("Invalid location.");
        q = null;
    }
    return q;
}

public static Node del_beg() {
         if(start!=null){
            start=start.next;
         }
    return start;
}
   

public static Node del_End(Node Start){
    if(start==null){
        System.out.println("No any Node Present to Delete !!");
    }else if(start.next==null){
          start=null;
          System.out.println("Last Node is Deleted !!!");
    }else{
        Node temp=start;
        while(temp.next.next!=null){
            temp=temp.next;
            
        }
        temp.next=null;
            System.out.println("Last Node Deleted !!!");
       
    }
    return start;
}

public static void sort(Node start){
    if(start== null){
        System.out.println("No any elements is Present in the LinkedList.....");

    }else if(start.next==null){
        System.out.println("The LinkedList is sorted !!!");
    }else{
        boolean swap;
        Node temp;
        Node LastNode = null;
        int trm ;
        int tm;
    do{
        swap = false;
        temp = start;
        while(temp.next!=LastNode){
            if(temp.marks<temp.next.marks){
                  trm = temp.regd_no;
                  tm = temp.marks;
                  temp.regd_no= temp.next.regd_no;
                  temp.marks=temp.next.marks;
                  temp.next.regd_no=trm;
                  temp.next.marks=tm;
                  swap = true;
            }
            temp= temp.next;
        }
        LastNode= temp;

    }while(swap);
      System.out.println("LinkedList is sorted according to the Marks in Descending Order !!!!");
}
}

public static void Sort(Node start){
    if(start== null){
        System.out.println("No any elements is Present in the LinkedList.....");

    }else if(start.next==null){
        System.out.println("The LinkedList is sorted !!!");
    }else{
        boolean swap;
        Node temp;
        Node LastNode = null;
        int trm ;
        int tm;
    do{
        swap = false;
        temp = start;
        while(temp.next!=LastNode){
            if(temp.marks>temp.next.marks){
                  trm = temp.regd_no;
                  tm = temp.marks;
                  temp.regd_no= temp.next.regd_no;
                  temp.marks=temp.next.marks;
                  temp.next.regd_no=trm;
                  temp.next.marks=tm;
                  swap = true;
            }
            temp= temp.next;
        }
        LastNode= temp;

    }while(swap);
      System.out.println("LinkedList is sorted according to the Marks in Accending Order !!!!");
}
}

public static Node Reverse(Node start1){  
    Node reversed = null;
     Node present = start1;
    Node hold;

    while(present != null){
        hold = present.next;
        present.next = reversed;
        reversed = present ;
        present = hold;
    }
    System.out.println("List Reversed Successfully....!!");
    start = reversed;
    return reversed;

}

public static void Del_any(){
    System.out.println("Enter the Node Location to be Deleted : ");
    int loc = sc.nextInt();
    int c = Count(start);
    if(loc<=c+1){
        if(start==null){
            return;
        }
        if(loc == 1){
            del_beg();
        }else if(loc == c){
            del_End(start);
        }else{
            Node temp = start;
            int cnt =1;
            while(cnt<loc-1){
                cnt++;
                temp=temp.next;
            }
            temp.next = temp.next.next;
        }
    }else{
        System.out.println("Wrong Location");
    }
}
    public static void main(String[] args) {
        int choice;
        while(true){
                  System.out.println("*****MENU*****");
                  System.out.println("0.Exit");
                  System.out.println("1.Create");
                  System.out.println("2.Display");
                  System.out.println("3.count");
                  System.out.println("4.Searching and Updating");
                  System.out.println("5.Insert from begining");
                  System.out.println("6.Insert from the End");
                  System.out.println("7.Insert at Any Point");
                  System.out.println("8.Delete from begining");
                  System.out.println("9.Delete from Last");
                  System.out.println("10.Sorting from higher to Lower");
                  System.out.println("11.Sorting from Lower to Higher");
                  System.out.println("12.Reverse !!!");
                  System.out.println("13.Delete at any Position !!");


            choice = sc.nextInt();
          
            switch(choice){
                case 0 : System.exit(0);

                case 1 : System.out.println("Creating New Node !!");
                          Node p = new Node();
                          create(p);
                          break;

                case 2 : System.out.println("Displaying the Node/Nodes ");       
                          Display(start);
                          break;

                 case 3 :  System.out.println("The Number of Nodes Present is : "+Count(start));  
                        break;
                 
                 case 4 : System.out.println("Search for Our Node ");
                           Search(start);
                           break;

                 case 5 : Node x = new Node();
                          ins_Beg(x); 
                          System.out.println("After Insertion Display : ");
                          Display(start);        
                          break;

                 case 6 : Node z = new Node();
                          ins_end(z) ; 
                          System.out.println("After insertion Display : "); 
                          Display(start);
                          break; 
                          
                case 7 : Node k = new Node();
                        ins_Any(k) ;
                        System.out.println("Display the List ");         
                        Display(start);
                        break;

                case 8 : del_beg();
                        // Display(start);
                         break;

                case 9 : del_End(start);
                        // Display(start);         
                         break;

                case 10 : sort(start); 
                           Display(start);
                           break;  
                           
                case 11 : Sort(start);           
                          Display(start);
                          break;
                
                case 12 : Reverse(start);
                         // Display(start);
                          break;          
               
                case 13 : Del_any();
                           break;

                           default:
                           System.out.println("Wrong Choice !!!!!");
            }
        }
    }
}