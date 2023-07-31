import java.util.Scanner;
class Stack1{
    public static boolean isFull(int top){
        return ( top == MAX -1 ) ;
    }
    public static boolean isEmpty(int top){
        return  (top==-1);
    }
    public static int push(Object []S,int top){
        if(isFull(top)){
            System.out.println("Stack Overflow !!!!");
        }else{
            System.out.println("Enter the element : ");
            Object ele = (Object)sc.nextInt();
            S[++top]=ele;
        }
        return top;
    }
    public static int pop(Object []S,int top){
        if(isEmpty(top)){
            System.out.println("Stack UnderFlow !!!!");
        }else{
            System.out.println("Deleted Element is : "+S[top--]);
        }
        return top;
    }
    public static void Display(Object []S, int top){
        if(isEmpty(top)){
            System.out.println("The Stack is empty , Nothing to Display ");
        }else{
            for(int i = 0 ; i<=top;i++){
                System.out.print(S[i]+" ");
                System.out.println();
            }

        }
    }
    static Scanner sc = new Scanner(System.in);
    public static final int MAX = 10;
public static void main(String[] args) {
    Object []stack = new Object[MAX];
    int top=-1;
    while(true)
              {
                   System.out.println("***MENU***");
                   System.out.println("0: Exit");
                   System.out.println("1: Push");
                   System.out.println("2: Pop");
                   System.out.println("3: Display");
                   System.out.println("Enter your choice");
                   int choice=sc.nextInt();
                   switch(choice){

              case 0 :System.exit(0);break;
              case 1 : System.out.println("Push into the Stack...!!!");       
                      top =  push(stack, top);
                      System.out.println("Now top is "+top);break;
              case 2 : System.out.println("Pop from the Stack ");        
                       top = pop(stack,top);
                       System.out.println("Now top is "+top);
                       break;
              case 3 : System.out.println("Display the Array : ");         
                       Display(stack,top);
                       break;

                     default : System.out.println("Invalid Choice !!!!");break;

}
}
}
}