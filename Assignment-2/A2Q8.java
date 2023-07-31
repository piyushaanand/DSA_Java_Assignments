import java.util.*;
interface DetailInfo{
        void display();
        void count();
}
class Person1 implements DetailInfo{
    static int maxcount =0;
    String name ;
    public void display(){
        System.out.println("Name : "+name);
        count();
    }
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = sc.nextLine();
    }

    public void count(){
        char []n = name.toCharArray();
        for(int i=0;i<n.length;i++){
            if(n[i]!=' '){
                maxcount++;
            }
        }
        System.out.println("Numbers of Characters : "+maxcount);
    }
}

public class A2Q8 {
    public static void main(String[] args) {
        Person1 obj = new Person1();
        obj.getData();
        obj.display();
    }
    
}
