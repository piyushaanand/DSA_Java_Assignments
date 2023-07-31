package Q10A;
import java.util.Scanner;
public class Test extends Student {
    public int mark1;
    public int mark2;

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
    }
    public void output(){
        super.output();
        System.out.println("Mark 1 : "+mark1);
        System.out.println("Mark 2 : "+mark2);
    }
}
